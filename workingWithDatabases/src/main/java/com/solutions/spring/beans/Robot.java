package com.solutions.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Jose on 3/12/2017.
 */
@Component
public class Robot {

    private String id = "Default robot";
    private String speech = "Hello";

    @Autowired
    public void setId(@Value("${jdbc.user}") String id) {
        this.id = id;
    }

    @Autowired
    public void setSpeech(@Value("${jdbc.password}") String speech) {
        this.speech = speech;
    }

    public void speak() {
        System.out.println(id + ": " + speech);
    }
}
