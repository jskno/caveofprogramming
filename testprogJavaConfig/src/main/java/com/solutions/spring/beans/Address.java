package com.solutions.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Jose on 3/11/2017.
 */
public class Address {

    private String street;
    private String postCode;

    public Address(String street,String postCode) {
        this.street = street;
        this.postCode = postCode;
    }

    public void init() {
        System.out.println("Bean created from  default init method " + this);
    }
    public void destroy() { System.out.println("Bean destroyed..." + this);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
