package org.javarevision;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int factorial = 1;

        while (n != 0) {
            factorial *= n;
            n -= 1;
            System.out.println("n is " + n);
        }
        System.out.println("factorial is " + factorial);

    }
}
