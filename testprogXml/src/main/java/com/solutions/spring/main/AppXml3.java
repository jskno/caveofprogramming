package com.solutions.spring.main;

import com.solutions.spring.beans.FruitBasket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jose on 3/11/2017.
 */
public class AppXml3 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        FruitBasket basket = (FruitBasket) context.getBean("fruitBasket");
        System.out.println(basket);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
