package com.solutions.spring.main;

import com.solutions.spring.config.JavaConfig;
import com.solutions.spring.database.dao.OfferDAO;
import com.solutions.spring.database.model.Offer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App3
{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        OfferDAO offerDAO = context.getBean(OfferDAO.class);

        Offer offer1 = offerDAO.getOfferById(1);
        Offer offer2 = offerDAO.getOfferById(2);

        if(offer1 != null) {
            offer1.setName("Marta");
            if(offerDAO.update(offer1)) {
                System.out.println("Update offer : " + offer1);
            }
        }

        if(offer2 != null) {
            offer2.setName("Libertad");
            if(offerDAO.update(offer2)) {
                System.out.println("Update offer : " + offer2);
            }
        }

        ((AnnotationConfigApplicationContext)context).close();
    }
}
