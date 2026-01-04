package org.javarevision.loops;

public class BreakContinue {
    public static void main(String[] args) {

        /* // BREAK
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                break;
            }
            System.out.println(i);
        }*/

        /* CONTINUE
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }*/

        // Digital Clock
        outer: for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (minute == 30){
                    continue;
                }
                if (hour == 10){
                    break outer;
                }
                System.out.printf("%02d:%02d\n", hour, minute);
            }
        }
    }
}
