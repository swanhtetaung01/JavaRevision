package org.javarevision.StringsStringBuffer;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSearching {
    public static void main(String[] args) {
        // TO WORK WITH STRINGS
        String[] words = {"Python", "Java", "C++", "JavaScript"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to search");
        String word = scanner.next();
        int index = Arrays.binarySearch(words, word);
        if(index < 0){
            System.out.println(word + " is not in the array");
        } else {
            System.out.println(word + " is at index " + index);
        }

        /*// TO WORK WITH NUMBERS
        int[] numbers = {10, 5, 6, 4, 3, 2, 8};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int number = scanner.nextInt();
        int index = Arrays.binarySearch(numbers, number);
        if (index < 0) {
            System.out.println(number + " is not in the array");
        } else {
            System.out.println(number + " is at index " + index);
        }*/
    }
}
