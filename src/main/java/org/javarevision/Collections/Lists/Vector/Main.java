package org.javarevision.Collections.Lists.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new Vector<Animal>();

        Animal a1 = new Animal("Lion", 'c');
        animals.add(a1);

        Animal a2 = new Animal("Tiger", 'c');
        animals.add(a2);

        Animal a3 = new Animal("Cow", 'h');
        animals.add(a3);

        Animal a4 = new Animal("Horse", 'h');
        animals.add(a4);

        List<Animal> carnivorous = new Vector<Animal>();
        List<Animal> herbivorous = new Vector<Animal>();

        for (Animal a :  animals) {
            boolean status = filterAnimal(a);
            if (status) {
                carnivorous.add(a);
            }else{
                herbivorous.add(a);
            }
        }

        System.out.println("Carnivorous are ");
        for (Animal a : carnivorous) {
            System.out.println(a.getName());
        }
        System.out.println("Herbivorous are ");
        for (Animal a : herbivorous) {
            System.out.println(a.getName());
        }

    }
    private static boolean filterAnimal(Animal animal) {
        if (animal.getType() == 'c')
            return true;
        else
            return false;
    }
}
