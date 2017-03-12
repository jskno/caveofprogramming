package com.solutions.spring.config;

import com.solutions.spring.beans.Address;
import com.solutions.spring.beans.Person;
import com.solutions.spring.factory.PersonFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jose on 3/11/2017.
 */
public class JavaConfig {

    @Bean(initMethod = "onCreate", destroyMethod = "onDestroy")
    public Person person() {
        Person person = new Person(111, "Jose");
        person.setTaxId("B1234");
        person.setGender("female");
        person.setAddress(address());
        return person;
    }

//    @MyBean
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Address address() {
        return new Address("aire, 18", "07000");
    }

    @Bean
    public PersonFactory personFactory() {
        return new PersonFactory();
    }

    @Bean(name = "person2", destroyMethod = "onDestroy")
    public Person person2() {
        return personFactory().createPerson(222, "Jose");
    }

    @Bean(name = "person3", destroyMethod = "onDestroy")
    public Person person3() {
        return Person.getInstance(333, "Jose");
    }
}
