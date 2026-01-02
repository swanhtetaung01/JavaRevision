package org.javarevision.Thread.SleepAndJoin;

class Thread4 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from run()");
        }
    }
}

public class ThreadSleepDemo {
    public static void main(String[] args) {
        Thread4 t = new Thread4();
        t.start();
    }
}
