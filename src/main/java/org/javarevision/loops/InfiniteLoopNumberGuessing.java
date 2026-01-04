package org.javarevision.loops;

import java.util.Random;
import java.util.Scanner;

public class InfiniteLoopNumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //System.out.println(random.nextInt(100));
        int secretNumber = random.nextInt(100);
        int userGuess;

        System.out.println("Welcome to the 'Guess the Secret Number' game!");
        while (true){
            System.out.println("Please enter your guess (0-99):");
            userGuess = scanner.nextInt();

            if (userGuess == secretNumber){
                System.out.println("Congratulations! You've found the secret number!");
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            //System.out.println(userGuess + ":" + secretNumber);
        }
    }
}
