package com.solutions.spring.factory;

import com.solutions.spring.beans.Person;

/**
 * Created by Jose on 3/11/2017.
 */
public class PersonFactory {

    public Person createPerson(int id, String name) {
        Person person = new Person(id, name);
        System.out.println("Using factory to create Person " + person);
        return person;
    }
}
