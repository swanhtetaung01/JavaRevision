package org.javarevision.modifiers.accessmodifiers.secondpackage;

import org.javarevision.modifiers.accessmodifiers.firstpackage.A;
import org.javarevision.modifiers.accessmodifiers.firstpackage.B;

public class E extends B {
    A a1 = new A();
    void printMessageFromE() {
        A a = new A();
        a.publicVariableInA = 60;
    }
    void printMessageFromE2() {
        a1.publicVariableInA = 60;
    }

}
