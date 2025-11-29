package org.javarevision.ifelseswitch;

import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent grade!"); break;
            case 'B':
                System.out.println("Amazing!"); break;
            case 'C':
                System.out.println("Well done!"); break;
            case 'D':
                System.out.println("Do better next time!"); break;
            default:
                System.out.println("Invalid grade!"); break;
        }
    }
}
