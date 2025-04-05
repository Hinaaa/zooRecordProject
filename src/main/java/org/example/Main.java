package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Printing Animals: ");
        //Object for Species
        Species species1 = new Species("Mammal", "Meat", 500);
        Species species2 = new Species("Reptile", "Mice", 100);

        //Animal1
        Owner owner1 = new Owner("John Paul", 30, "ABC Street 64, 13806");
        Animal animal1 = new Animal(1, "Tiger", "Mammal", 3, owner1, species1);
        System.out.println(animal1);

        //Animal 2
        Owner owner2 = new Owner("Martina Johnny ", 25, "ABC Street 64, 13806");
        Animal animal2 = new Animal(2, "Snake", "Reptile", 4, owner2, species2);
        System.out.println(animal2);

        //Animal 3
        Owner owner3 = new Owner("Jana Jorden ", 32, "C Street 43, 13806");
        Animal animal3 = new Animal(3, "Cat", "Mammal", 1, owner3, species1);
        System.out.println(animal3);

        //Zoo. Putting all animals together
        List<Animal> animalList = List.of(animal1, animal2, animal3);
        Zoo zoo = new Zoo(animalList);
        zoo.printAnimals(animalList);
    }
}