package org.javarevision.modifiers.strictfpexample;

public strictfp class StrictfpDemo {
    public strictfp void demo(){
        System.out.println(200/3);
    }
}

strictfp interface test{

    //strictfp -> all the floating point calculations will follow IEEE 754 standards
    //strictfp modifier can be used in classes, methods, and interfaces only.
    //When class is declared as stritfp, all the methods and inner type will be strictfp.
    //strictfp can be combined with abstract keyword.

}
