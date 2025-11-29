package org.javarevision;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            System.out.println("Type two numbers: ");
            float x = scanner.nextFloat();
            float y = scanner.nextFloat();
            System.out.println("Sum of the numbers: " + (x + y));
            System.out.println("Type true to continue and false to stop.");
            continueLoop = scanner.nextBoolean();
        }while(continueLoop);

        System.out.println("Loop ended!!");
    }
}
