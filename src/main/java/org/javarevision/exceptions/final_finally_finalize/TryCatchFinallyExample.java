package org.javarevision.exceptions.final_finally_finalize;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Hello");  //eg. arithmetic error
        } catch (Exception e){ // eg. sql exception here
            System.out.println("In catch block");
        } finally { //eg. will skip the catch and go to finally block and disconnection the database connection
            System.out.println("In finally block");
        }

    }
}
