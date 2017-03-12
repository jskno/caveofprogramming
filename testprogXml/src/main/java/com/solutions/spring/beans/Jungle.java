package com.solutions.spring.beans;

import java.util.List;

/**
 * Created by Jose on 3/11/2017.
 */
public class Jungle {

    private Animal largest;
    private List<Animal> animals;

    public Animal getLargest() {
        return largest;
    }

    public void setLargest(Animal largest) {
        this.largest = largest;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("largest: " + getLargest());
        sb.append("\n");
        sb.append("Others:\n");

        animals.stream().forEach(animal -> {
            sb.append(animal);
            sb.append("\n");
        });

        return sb.toString();
    }
}
