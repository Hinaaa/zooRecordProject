## Zoo Project using Record

## Overview:
This project uses Java Records, Composition, and ArrayList to manage animals, owners, species, and a zoo. It models a zoo where animals have associated owners and species, and calculates total food requirements for all animals.

## How It Works:
Animals: Created with properties like ID, name, species, and age.
Owners: Each animal has an associated owner with properties like name, age, and address.
Species: Each animal is linked to a species with details like food type and daily food requirements.
Zoo: The zoo contains all animals and calculates the total food requirements.

## Key Concepts:
Java Records: Used to define immutable data structures.
Composition: Animals have owners and species.
ArrayList: Stores multiple animals in the zoo.
Method Overriding: Uses default toString() and equals() methods.

## Files:
Main.java: Entry point, creates animals and calculates food requirements.
Animal.java, Owner.java, Species.java: Define the respective records.
Zoo.java: Contains a list of animals and calculates total food needs.

## Requirements:
Java 17+
IDE like IntelliJ IDEA
