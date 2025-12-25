package org.javarevision.VariablesandDatatypes;

public class EnumInJava {
    public static void main(String[] args) {
        enum Days{
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }

        enum State{
            ON, OFF
        }

        System.out.println(State.ON);

        State s1 = State.ON;
        State s2 = State.OFF;

        // name()
        System.out.println("Name of s1: " + s1.name());


        // values()
        System.out.println("Value at 0: " + State.values()[0]);

        // valueOf()
        State s3 = State.valueOf("ON");
        System.out.println("Value of ON: "+s3);

        // ordinal()
        System.out.println(s2.ordinal());
    }
}

