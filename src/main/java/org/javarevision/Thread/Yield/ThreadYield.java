package org.javarevision.Thread.Yield;

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //Thread.yield();
            System.out.println("Hello from run()");
        }
    }
}

public class ThreadYield {
    public static void main(String[] args) {
        Thread2 t = new Thread2();
        t.start();
        for (int i = 0; i < 10; i++) {
            Thread2.yield();
            System.out.println("Hello from main()");
        }
    }
}
