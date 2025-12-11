package org.javarevision.exceptions.controlflowintrycatch;

public class NoMatchingException {

    /*
Exception not of matching type
How to execute this file. Right click --> Run <FileName>.main()
*/


    public static void main(String[] args) {
        try {
            System.out.println("Statement 1");
            System.out.println(10/0);
            System.out.println("Statement 3");
        } catch (NullPointerException e){
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }
}
