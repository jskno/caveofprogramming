package com.solutions.spring.database.dao;

import com.solutions.spring.database.mapper.OfferMapper;
import com.solutions.spring.database.model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jose on 3/12/2017.
 */
@Component("offerDao")
public class OfferDAO {

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Offer> getOffers() {
        return jdbcTemplate.query("Select * From offers", new OfferMapper());
    }

    public List<Offer> getOffersByName(String name) {

        MapSqlParameterSource params = new MapSqlParameterSource("name", name);
        return  namedParameterJdbcTemplate.query("Select * From offers Where name = :name",
                params, new OfferMapper());
    }

    public Offer getOfferById(int id) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        return namedParameterJdbcTemplate.queryForObject(
                "Select * From offers Where id = :id",
                params, new OfferMapper());
    }

    public boolean deleteOffer(int id) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        return namedParameterJdbcTemplate.update(
                "Delete from offers Where id = :id", params) == 1;
    }

    public boolean createOffer(Offer offer) {

        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
        return namedParameterJdbcTemplate.update(
            "Insert into offers (name, email, text) values (:name, :email, :text)", params) == 1;
    }

    public boolean update(Offer offer) {
        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
        return namedParameterJdbcTemplate.update(
                "Update offers set name = :name, text = :text, email = :email Where id = :id",
                params) == 1;
    }

    public int[] create(List<Offer> offers) {

        SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offers.toArray());
        return namedParameterJdbcTemplate.batchUpdate(
                "Insert into offers (name, email, text) values (:name, :email, :text)",
                params);
    }

    @Transactional
    public int[] createForTx(List<Offer> offers) {

        SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offers.toArray());
        return namedParameterJdbcTemplate.batchUpdate(
                "Insert into offers (id, name, email, text) values (:id, :name, :email, :text)",
                params);
    }
}
