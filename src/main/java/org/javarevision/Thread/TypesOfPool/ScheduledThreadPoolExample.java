package org.javarevision.Thread.TypesOfPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);

        // Schedules task after delay 10 seconds
        executorService.schedule(new Task(), 10, TimeUnit.SECONDS);

        // Schedules task after initial delay of 3 seconds. It will run repeatedly after every 2 seconds
        executorService.scheduleAtFixedRate(new Task(), 3, 2, TimeUnit.SECONDS);

        // Schedules task after initial delay of 3 seconds.
        // It will run repeatedly after previous task is completed at delay of every 2 seconds
        executorService.scheduleWithFixedDelay(new Task(), 3, 2, TimeUnit.SECONDS);
    }
}
