package com.solutions.spring.main;

import com.solutions.spring.beans.Jungle2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jose on 3/11/2017.
 */
public class AppXml5 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Jungle2 jungle2 = (Jungle2) context.getBean("jungle2");
        System.out.println(jungle2);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
