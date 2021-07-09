package com.company;

public class Main {

    public static void main(String[] args) {
        // OOP - object oriented programming
        // A paradigm is a way to view things.
        // Example: object is a car
        // A class is a blueprint for creating objects
        // Features of the car: colour, number of tires, price, model (fields or class variables)
        // Behaviour or actions of the car: switching engine on, switching engine off,
        // moving forward, moving backward, turning left/right (methods)

        // Inheritance: a mechanism that allows us to share behaviour between classes. A class that inherits from another class is a child class,
        // class which is inherited from - parent class.
        // Mercedes: convertible, compressor engine, colour chrome

        // Encapsulation: a process of hiding data and methods from the "outside world", meaning from public access.
        // public, private
        // typically we use getters and setters to access such values

        //Abstraction
        // Abstraction is  mechanism that is focused on hiding implementation details from the user. The user does not need to know how it was
        // done, just that it works

        // Polymorphism: the ability of an object to return different responses to the same request or method call.
        // Number<decimal> = new Double(5.6);
        // Number<integer> - new Integer(3);

        // Calling the car object

//        Car car = new Car();
//        System.out.println(Car.colour);
//        System.out.println(Car.noOfTires);
//        System.out.println(Car.brand);
//        System.out.println(car.getColour());
//        car.setColour("Blue");
//        System.out.println(car.getColour());

//        car.setNoOfTires(8);
//        car.setBrand("BMW limousine");

//        car.startEngine(true);

        Bird penguin = new Bird();
        penguin.sing(false);
        penguin.fly(false);
        penguin.setNoOfLegs(2);
        penguin.walk();
        penguin.setColour("pink");
        System.out.println(penguin.getColour());

    }
}

// create a new class named Bird
// bird should have colour, nr of wings, nr of legs (private fields)
// should be able to fly, walk, sing (public methods)
// use getters and setters for your fields

// Assignment
// Create a class that models a person
// features: height, gender, complexion, age
// actions: walking, talking, eating, running
