package com.company.vehicle;

public class Car {
    public String color;
    public int numWheels;
    public int numberOfDoors;

    public Car() {
    }
    public Car(String color, int numWheels, int numberOfDoors){
    this.color = color;
    this.numWheels = numWheels;
    this.numberOfDoors = numberOfDoors;
}


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

//    public void setNumberOfDoors(int numberOfDoors) {
//        this.numberOfDoors = numberOfDoors;
//    }

    public void start(){
       System.out.println("Car starting");
    }
    public void stop(){
        System.out.println("Car stopping");
    }
    // no args
    public void drive(){
        System.out.println("Car moving");
    }
    // int miles
    public void drive(int miles){
        System.out.println("Driving for " + miles+" miles");
    }
    // int mile and int speed
    public void drive(int miles, int speed){
        System.out.println("Driving "+ speed + " mph for " + miles + " miles.");
    }
    // String destination
    public void drive(String destination){
        System.out.println("Driving to "+ destination);
    }

    // private (internal) constants
    private static final int MAX_DOORS = 6;
    private static final int MIN_DOORS = 1;

    // public (external) constants
    public static final String TYPE_SPORTY = "Sporty";
    public static final String TYPE_FAMILY = "Family";

    // a new property and its respective accessors
    private String carType;

    public Car(String color, int numberOfDoors) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public String getCarType()
    {
        return carType;
    }
    public void setCarType(String carType)
    {
        this.carType = carType;
    }
    // rest of class the same with the exception of setNumberOfDoors
    public void setNumberOfDoors(int numberOfDoors)
    {
        if ( MIN_DOORS >= 1 && numberOfDoors <= MAX_DOORS)
            this.numberOfDoors = numberOfDoors;
        else
            this.numberOfDoors = -1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", numWheels=" + numWheels +
                ", numberOfDoors=" + numberOfDoors +
                ", carType='" + carType + '\'' +
                '}';
    }
}

