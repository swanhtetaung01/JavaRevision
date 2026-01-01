package org.javarevision.Thread;

class RunnableThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from run()");
        }
    }
}

public class ThreadRunnableDemo {
    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();
        Thread t = new Thread(runnableThread);
        t.start();
    }
}
