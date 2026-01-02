package org.javarevision.Thread;

class ThreadClassNormal extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from run()");
        }
    }
}

class ThreadClassSleep extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from run() sleep");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException occur");
        }
    }
}

public class ThreadInterrupt {
    public static void main(String[] args) {
        ThreadClassNormal threadClassNormal = new ThreadClassNormal();
        threadClassNormal.start();
        threadClassNormal.interrupt();

        ThreadClassSleep threadClassSleep = new ThreadClassSleep();
        threadClassSleep.start();
        threadClassSleep.interrupt();
    }
}