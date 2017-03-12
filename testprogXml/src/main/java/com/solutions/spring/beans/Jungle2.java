package com.solutions.spring.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jose on 3/11/2017.
 */
public class Jungle2 {

    private Map<String, String> foods = new HashMap<>();

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        foods.entrySet().stream().forEach(food -> {
            sb.append(food.getKey() + ": " + food.getValue() + "\n");
        });

        return sb.toString();
    }
}

