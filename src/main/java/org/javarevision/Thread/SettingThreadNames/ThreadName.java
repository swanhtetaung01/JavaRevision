package org.javarevision.Thread.SettingThreadNames;

public class ThreadName {
    public static void main(String[] args) {
        Thread t = new Thread(new Task());
        System.out.println(t.getName());
        t.setName("First Thread");
        System.out.println(t.getName());
    }
}
