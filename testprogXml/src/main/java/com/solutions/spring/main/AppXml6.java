package com.solutions.spring.main;

import com.solutions.spring.beans.Jungle2;
import com.solutions.spring.beans.Jungle3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jose on 3/11/2017.
 */
public class AppXml6 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Jungle3 jungle3 = (Jungle3) context.getBean("jungle3");
        System.out.println(jungle3);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
