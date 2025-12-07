package org.javarevision.accessmodifiers.secondpackage;

import org.javarevision.accessmodifiers.firstpackage.A;
import org.javarevision.accessmodifiers.firstpackage.B;

public class D extends B {
    void printMessageFromD(){
        A a = new A();
        a.publicVariableInA = 60;
        //a.protectedVariableInA = 20;
        //a.printMessageFromA();

        B b = new B();
        b.publicVariableInB = 60;
        printMessageFromB();
        protectedVariableInB = 100;
    }
}
