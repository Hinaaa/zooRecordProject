package org.example;

import java.util.List;

public record Zoo(List<Animal> animals) {
    public void printAnimals (List<Animal> animals) {
        int sum = 0;
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i); //fetching from animal one by one
            sum = sum + animal.species().requirementInGramsPerDay();
        }
        System.out.println("total food requirements of all animals in Grams = "+ sum);
    }
}
