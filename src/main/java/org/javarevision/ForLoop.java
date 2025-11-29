package org.javarevision;

import java.util.Scanner;

public class ForLoop {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        float x = sc.nextFloat();
        for (int i = 1; i < 11; i++){
            System.out.println(x + " * " + i + " = " + (x * i));
        }
    }
}
