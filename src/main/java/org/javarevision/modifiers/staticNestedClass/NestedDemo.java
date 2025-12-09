package org.javarevision.modifiers.staticNestedClass;

public class NestedDemo {
    private int x;
    int y;
    private static int z = 100;

    class Nested {
        void method1() {
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
    }

    static class StaticNested{
        public void method1(){
            System.out.println("Nested static method");
            //System.out.println(x);
            //System.out.println(y);
            System.out.println(z);
        }
    }

    public static void main(String[] args) {
        //Nested nested = new Nested();
        NestedDemo nestedDemo = new NestedDemo();
        Nested nested = nestedDemo.new Nested();
        nested.method1();

        StaticNested staticNested = new StaticNested();
        staticNested.method1();
    }
}


