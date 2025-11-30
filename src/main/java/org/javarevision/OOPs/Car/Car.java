package org.javarevision.OOPs.Car;

public class Car {

    public String model;
    public String color;
    public int seats;

    public Car(){
        model = "Test model";
        color = "test Color";
        seats = 4;
        System.out.println("First constructor");
    }

    public Car(String model, String color, int seats){
        this.model = model;
        this.color = color;
        this.seats = seats;
    }

    public void display(){
        System.out.println("Model is : " + model);
        System.out.println("Color is : " + color);
        System.out.println("Seats is : " + seats);
    }


    /* ---- Methods VS constructors ------
    * Constructors have no return type, whereas methods do have
    * Constructors name should be same as class name, however that’s not
      true in case of methods
    * Java has a default constructor, but there is no such thing called default methods

    * */



    /*

    ---- Rules for constructors -----

    * Same name as classes
    * Constructors don’t have a return type
    * Declaring constructors in not mandatory
    * There won’t be any default constructor created by java if you have
      declared a constructor
    * Constructors cannot be inherited

    */
}