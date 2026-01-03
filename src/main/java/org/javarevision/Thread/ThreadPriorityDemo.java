package org.javarevision.Thread;

class ThreadDemo extends Thread {
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        System.out.println(t.getPriority());
        t.setPriority(9);
        System.out.println(t.getPriority());
    }
}
