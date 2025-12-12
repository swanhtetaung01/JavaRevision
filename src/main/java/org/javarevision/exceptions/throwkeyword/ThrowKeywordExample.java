package org.javarevision.exceptions.throwkeyword;

public class ThrowKeywordExample {
    public static void main(String[] args) {
        //Syntax 1
        ArithmeticException ex = new ArithmeticException("You tried to divide by zero");
        throw ex;

        /*
        //Syntax 2
        throw new ArithmeticException("You tried to divide by zero");
        */
    }
}
