package org.javarevision;

import java.util.Scanner;

public class NestedLaddered_ifelse {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int age = scanner.nextByte();

        if (age > 21) {
            if (age > 55) {
                System.out.println("Senior citizen account");
            } else if (age < 55) {
                System.out.println("Savings account");
            }
        }
        else if (age < 21) {
            System.out.println("Ineligible");
        }
    }
}