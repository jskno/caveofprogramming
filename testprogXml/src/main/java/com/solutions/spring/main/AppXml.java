package com.solutions.spring.main;

import com.solutions.spring.beans.Address;
import com.solutions.spring.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppXml
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Person person = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");
        person.speak();
        System.out.println(person);

        Address address = context.getBean("address", Address.class);
        System.out.println(address);

        person2.setId(111);
        System.out.println(person);

        ((ClassPathXmlApplicationContext) context).close();

    }
}
