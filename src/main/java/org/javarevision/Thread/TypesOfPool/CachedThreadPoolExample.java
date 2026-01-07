package org.javarevision.Thread.TypesOfPool;

import org.javarevision.Thread.SettingThreadNames.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Task());
        }
    }
}
