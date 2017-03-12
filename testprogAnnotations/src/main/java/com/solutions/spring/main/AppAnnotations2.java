package com.solutions.spring.main;

import com.solutions.spring.beans.Address;
import com.solutions.spring.beans.Person;
import com.solutions.spring.config.AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppAnnotations2
{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Person person = (Person) context.getBean("person");
        person.speak();
        System.out.println(person);

        Address address = context.getBean("address", Address.class);
        System.out.println(address);

        ((AnnotationConfigApplicationContext) context).close();

    }
}
