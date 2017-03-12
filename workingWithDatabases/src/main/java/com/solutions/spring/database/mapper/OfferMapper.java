package com.solutions.spring.database.mapper;

import com.solutions.spring.database.model.Offer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by Jose on 3/12/2017.
 */
public class OfferMapper implements RowMapper<Offer> {


    @Override
    public Offer mapRow(ResultSet resultSet, int i) throws SQLException {
        Offer offer = new Offer();
        offer.setId(resultSet.getInt("id"));
        offer.setName(resultSet.getString("name"));
        offer.setEmail(resultSet.getString("email"));
        offer.setText(resultSet.getString("text"));
        return offer;
    }
}
