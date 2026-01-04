package org.javarevision.ifelseswitch;

import java.util.Scanner;

public class DeepDiveSwitchExpressions {
    public static void main(String[] args) {
        System.out.println("Choose an option");
        System.out.println("1. Say Hello");
        System.out.println("2. Say Goodbye");
        System.out.println("3. Say Nothing");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        String result = switch (choice){
            case 1, 5, 6 -> "Hello";
            case 2 -> "Goodbye!";
            case 3 -> "(Silence)";
            case 4 -> {
                int sum = 2 + 2;
                yield "The sum of 2 + 2 is " + sum;
            }
            default -> "Invalid Choice";
        };
        System.out.println(result);
        System.out.println("Thank you for using our program!");
    }
}
