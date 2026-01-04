package org.javarevision.ifelseswitch;

import java.util.Scanner;

public class SwitchExpressionsMethods {
    public static void main(String[] args) {
        System.out.println("Choose an option");
        System.out.println("1. Say Hello");
        System.out.println("2. Say Goodbye");
        System.out.println("3. Say Nothing");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println(menuOptions(choice));
        System.out.println("Thank you for using our program!");
    }

    private static String menuOptions(int choice) {
        return switch (choice){
            case 1, 5, 6 -> "Hello";
            case 2 -> "Goodbye!";
            case 3 -> "(Silence)";
            case 4 -> {
                int sum = 2 + 2;
                yield "The sum of 2 + 2 is " + sum;
            }
            default -> "Invalid Choice";
        };
    }
}
