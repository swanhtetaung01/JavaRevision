package org.javarevision.exceptions.throwskeyword;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsKeyword {
    public static void main(String[] args) throws FileNotFoundException {

        doOneThing();

    }

    private static void doOneThing() throws FileNotFoundException {
        doOneMoreThing();
    }

    private static void doOneMoreThing() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("abc.txt");
        System.out.println(10 / 0);
    }
}

