package com.solutions.spring.beans;

import java.util.List;

/**
 * Created by Jose on 3/11/2017.
 */
public class FruitBasket {

    private String name;
    private List<String> fruits;

    public FruitBasket(String name, List<String> fruits) {
        this.name = name;
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name);
        sb.append(": contains\n");

        fruits.stream().forEach(fruit -> {
            sb.append(fruit);
            sb.append("\n");
        });

        return sb.toString();
    }
}
