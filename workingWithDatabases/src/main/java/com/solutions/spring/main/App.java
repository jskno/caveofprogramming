package com.solutions.spring.main;

import com.solutions.spring.config.JavaConfig;
import com.solutions.spring.database.dao.OfferDAO;
import com.solutions.spring.database.model.Offer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        OfferDAO offerDAO = context.getBean(OfferDAO.class);

        Offer offerToDelete = offerDAO.getOfferById(4);
        if(offerToDelete != null) {
            offerDAO.deleteOffer(offerToDelete.getId());
            System.out.println("Offer deleted: " + offerToDelete);
        }

        System.out.println("First query :\n");
        try {
            List<Offer> offers1 = offerDAO.getOffers();
            offers1.stream().forEach(offer -> System.out.println(offer));
        } catch (CannotGetJdbcConnectionException ex) {
            System.out.println(" First: " + ex.getMessage());
        } catch (DataAccessException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
        }

        System.out.println("\nSecond query : ");
        List<Offer> offers2 = offerDAO.getOffersByName("Sue");
        offers2.stream().forEach(offer -> System.out.println(offer));

        System.out.println("\nThird query : ");
        Offer offer3 = offerDAO.getOfferById(1);
        System.out.println(offer3);


        ((AnnotationConfigApplicationContext)context).close();
    }
}
