package org.javarevision.OOPs.Polymorphism.abstractexercises;

public class Tesla extends Car {
    @Override
    void applyBrakes() {
        System.out.println("Apply brakes to tesla");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerate tesla");
    }
}
