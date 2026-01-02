package org.javarevision.Thread;

class ThreadEmpty extends Thread {
}

public class ThreadClassEmpty {
    public static void main(String[] args) {
        ThreadEmpty t = new ThreadEmpty();
        t.start();
    }
}
