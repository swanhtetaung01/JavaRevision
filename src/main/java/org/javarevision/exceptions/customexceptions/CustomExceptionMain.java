package org.javarevision.exceptions.customexceptions;

import java.util.Scanner;

public class CustomExceptionMain {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age < 18)
            throw new TooYoungException("You are too young to do this job");
        else if(age > 60)
            throw new TooOldException("You are too old to do this job");
        else
            System.out.println("We will process your details shortly");
    }
}
