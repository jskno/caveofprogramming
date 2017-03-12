package com.solutions.spring.main;

import com.solutions.spring.beans.FruitBasket;
import com.solutions.spring.beans.Jungle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jose on 3/11/2017.
 */
public class AppXml4 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Jungle jungle = (Jungle) context.getBean("jungle");
        System.out.println(jungle);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
