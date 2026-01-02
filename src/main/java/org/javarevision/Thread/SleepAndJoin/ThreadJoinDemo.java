package org.javarevision.Thread.SleepAndJoin;

class Thread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from run()");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread3 t = new Thread3();
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from main()");
        }
    }
}
