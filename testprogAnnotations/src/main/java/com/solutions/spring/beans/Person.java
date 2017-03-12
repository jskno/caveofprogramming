package com.solutions.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Jose on 3/11/2017.
 */
@Component
@Scope("singleton")
public class Person {

    private int id;
    private String name;
    @Value("B123")
    private String taxId;
    private String gender;
    @Autowired
    private Address address;

    public Person() {
    }

//    @Autowired
    public Person(@Value("777") int id,@Value("Jose") String name) {
        this.id = id;
        this.name = name;
    }

    public static Person getInstance(int id, String name) {
        System.out.println("Creating Person using factory method");
        return new Person(1234, "Bob");
    }

    @PostConstruct
    public void onCreate() {
        System.out.println("Person created " + this);
    }

    // Only executed with scope singleton
    @PreDestroy
    public void onDestroy() {
        System.out.println("Person destroyed " + this);
    }

    public void speak() {
        System.out.println("Hello I'm a person");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getGender() {
        return gender;
    }

    @Value("female")
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId='" + taxId + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }

}
