package org.javarevision.Thread;

class ThreadOverride extends Thread{
    @Override
    public synchronized void start() {
        System.out.println("Normal start");
    }

    @Override
    public void run() {
        System.out.println("Normal run");
    }
}

public class OverridingStart {
    public static void main(String[] args) {
        ThreadOverride t = new ThreadOverride();
        t.start();
    }
}
