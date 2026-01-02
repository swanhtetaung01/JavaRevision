package org.javarevision.Thread;

class ThreadOverload extends Thread {
    @Override
    public void run() {
        System.out.println("Normal Run");
    }

    public void run(int i) {
        System.out.println("Run with parameters");
    }
}

public class OverloadedRun {
    public static void main(String[] args) {
        ThreadOverload t = new ThreadOverload();
        t.start();
    }
}
