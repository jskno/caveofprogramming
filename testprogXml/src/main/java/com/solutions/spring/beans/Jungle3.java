package com.solutions.spring.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jose on 3/11/2017.
 */
public class Jungle3 {

    private Map<String, String> foods = new HashMap<>();
    private Map<String, Animal> animals = new HashMap<>();

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    public void setAnimals(Map<String, Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        foods.entrySet().stream().forEach(food -> {
            sb.append(food.getKey() + ": " + food.getValue() + "\n");
        });

        sb.append("\n");

        animals.entrySet().stream().forEach(animal -> {
            sb.append(animal.getKey() + ": " + animal.getValue() + "\n");
        });

        return sb.toString();
    }
}
