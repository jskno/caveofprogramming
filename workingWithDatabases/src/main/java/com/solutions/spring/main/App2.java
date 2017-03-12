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
public class App2
{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        OfferDAO offerDAO = context.getBean(OfferDAO.class);

        Offer offer1 = new Offer("Jose", "jskno@gmail.com", "Coding java spring");
        Offer offer2 = new Offer("Raquel", "raquel@gmail.com", "Coding bi");

        if(offerDAO.createOffer(offer1)) {
            System.out.println("Created offer : " + offer1);
        }
        if(offerDAO.createOffer(offer2)) {
            System.out.println("Created offer : " + offer1);
        }

        ((AnnotationConfigApplicationContext)context).close();
    }
}
