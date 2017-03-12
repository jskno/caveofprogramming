package com.solutions.spring.beans;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Jose on 3/12/2017.
 */
@Component
public class RandomText {

    public static String[] texts = {
            "I'll be back",
            "Get out!",
            "I want you clothes",
            null
    };

    public String getText() {
        Random random = new Random();

        return texts[random.nextInt(texts.length)];
    }
}
