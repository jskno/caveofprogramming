package com.solutions.spring.main;

import com.solutions.spring.beans.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App4
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context4.xml");

        Logger logger = (Logger) context.getBean("logger");
        logger.writeConsole("Hello there");
        logger.writeFile("Hello again !!");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
