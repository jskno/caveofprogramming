package com.solutions.spring.main;

import com.solutions.spring.config.JavaConfig;
import com.solutions.spring.database.dao.OfferDAO;
import com.solutions.spring.database.model.Offer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App5
{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        OfferDAO offerDAO = context.getBean(OfferDAO.class);

        List<Offer> offers = new ArrayList<>();
        Offer offer1 = new Offer(17, "Julio", "geronimo@gmail.com", "Let's play");
        Offer offer2 = new Offer(10, "Mario", "luis@gmail.com", "I'll catch you tomorrow");

        offers.add(offer1);
        offers.add(offer2);

        int[] rvals = offerDAO.createForTx(offers);
        for (int value : rvals) {
            System.out.println("Update " + value + " rows");
        }

        List<Offer> allTheOffers = offerDAO.getOffers();
        allTheOffers.stream().forEach(offer -> System.out.println(offer));

        ((AnnotationConfigApplicationContext)context).close();
    }
}
