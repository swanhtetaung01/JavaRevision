package org.javarevision.OOPs.Car;

public class ClassesMain {
    public static void main(String[] args) {

        Car ferrari = new Car();
        ferrari.model = "Ferrari F430";
        ferrari.seats = 4;
        ferrari.color = "Red";
        ferrari.display();

        Car tesla = new Car();
        tesla.model = "Model S";
        tesla.seats = 4;
        tesla.color = "Black";
        tesla.display();

        Car audi = new Car();
        audi.model = "Audi SQ5";
        audi.color = "Blue";
        audi.seats = 4;
        audi.display();


    }
}
