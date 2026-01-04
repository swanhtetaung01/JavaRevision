package org.javarevision.OOPs;

class Car1 {
    public String model;
    public String color;
    public int seats;

    public Car1(String model, String color, int seats) {
        this.model = model;
        this.color = color;
        this.seats = seats;
    }

    public Car1(Car1 car) {
        this.model = car.model;
        this.color = car.color;
        this.seats = car.seats;
    }

    public void display() {
        System.out.println("Model is: " + this.model);
        System.out.println("Color is: " + this.color);
        System.out.println("Seats is: " + this.seats);
    }
}

public class CopyConstructors {
    public static void main(String[] args) {
        Car1 ferrari = new Car1("Ferrari F430", "Red", 4);
        ferrari.display();

        Car1 myCar = new Car1(ferrari);
        myCar.display();
    }
}