package org.javarevision.Thread;

class Thread11 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from run()");
        }
    }
}

public class StartVsRun {
    public static void main(String[] args) {
        Thread11 t1 = new Thread11();
        Thread11 t2 = new Thread11();
        /*t1.start();
        t2.start();*/
        t1.run();
        t2.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from main()");
        }
    }
}
