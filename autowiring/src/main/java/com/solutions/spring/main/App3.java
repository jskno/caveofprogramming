package com.solutions.spring.main;

import com.solutions.spring.beans.Logger2;
import com.solutions.spring.beans.Logger3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App3
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context3.xml");

        Logger3 logger3 = (Logger3) context.getBean("logger3");
        logger3.writeConsole("Hello there");
        logger3.writeFile("Hello again !!");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
