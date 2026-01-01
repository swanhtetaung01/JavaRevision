package org.javarevision.Thread;

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from run()");
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from main()");
        }
    }
}
