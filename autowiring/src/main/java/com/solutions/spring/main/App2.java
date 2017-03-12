package com.solutions.spring.main;

import com.solutions.spring.beans.Logger;
import com.solutions.spring.beans.Logger2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context2.xml");

        Logger2 logger2 = (Logger2) context.getBean("logger2");
        logger2.writeConsole("Hello there");
        logger2.writeFile("Hello again !!");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
