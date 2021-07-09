package com.company;

public class Bird {

    private String colour; //if there is no static keyword then it is an instant variable
    private int noOfWings;
    private int noOfLegs;

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNoOfWings() {
        return this.noOfWings;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    public int getNoOfLegs() {
        return this.noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public void sing(boolean songbird) {
        if (songbird) {
            System.out.println("This bird can sing");
        } else {
            System.out.println("This bird does not sing");
        }
    }

    public void fly (boolean canFly) {
        if (canFly) {
            System.out.println("This bird is able to fly");
        } else {
            System.out.println("This is a non - flying bird");
        }
    }

    public void walk () {
        if (this.noOfLegs == 2) {
            System.out.println("This bird is able to walk");
        } else {
            System.out.println("This is bird is missing a leg and cannot walk");
        }
    }


}
