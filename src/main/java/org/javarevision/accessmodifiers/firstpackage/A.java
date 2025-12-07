package org.javarevision.accessmodifiers.firstpackage;

/*
Public > Protected > Default > Private

 */

public class A {
    private int privateVariableInA;
    int defaultVariableInA;
    public int publicVariableInA;
    protected int protectedVariableInA;
    public int publicIntegerInA;

    protected void printMessageFromA(){
        privateVariableInA = 1000;
        protectedVariableInA = 100;
    }
}
