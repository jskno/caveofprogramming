package com.solutions.spring.main;

import com.solutions.spring.beans.Address;
import com.solutions.spring.beans.Person;
import com.solutions.spring.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Jose on 3/11/2017.
 */
public class AppConfigClasses {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Person person = (Person) context.getBean("person");
        Person person2 = context.getBean("person", Person.class);

        person.speak();
        System.out.println(person);

        person2.speak();
        System.out.println(person2);

        Address address = context.getBean("address", Address.class);
        System.out.println(address);

        System.out.println("They are the same person: " + (person == person2));

        ((AnnotationConfigApplicationContext) context).close();

    }
}
