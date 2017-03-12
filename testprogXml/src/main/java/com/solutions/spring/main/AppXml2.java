package com.solutions.spring.main;

import com.solutions.spring.beans.Address;
import com.solutions.spring.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppXml2
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Person person = (Person) context.getBean("person");
        person.speak();
        System.out.println(person);

        Address address2 = context.getBean("address2", Address.class);
        System.out.println(address2);

        ((ClassPathXmlApplicationContext) context).close();

    }
}
