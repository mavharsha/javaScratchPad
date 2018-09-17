package com.mavharsha.scratchPad;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1000Threads {

    @Test
    public void testRun1000Threads() {

        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new Task());
            thread.start();
        }
    }

    private static class Task implements Runnable{
        @Override
        public void run() {
                System.out.println("Current Thread:" + Thread.currentThread().getName());
        }
    }


    @Test
    public void tasksWithExecutorService() {
        ExecutorService service = Executors.newFixedThreadPool(10);

        int numberOfCores =  Runtime.getRuntime().availableProcessors();
        service = Executors.newFixedThreadPool(numberOfCores);
        // ExecutorService internally uses a blocking queue, with stores all the tasks that are submitted.
        // Then the executor thread assigns tasks to the threads in the thread pool.

        // 1. Fetch next task from the queue.
        // 2. Execute it.
        // In java, one java thread is equal to one OS thread.
        // So, in case of a four core machine, at max one four threads run concurrently.
        for (int i = 0; i < 1000; i++) {
            service.execute(new Task());
        }
        service.shutdown();
    }

    // Java provides 4 types of thread pool.
    // 1. newFixedThreadPool -- the task are put in a BLOCKING QUEUE. and then assigned to a thread from the thread pool which is waiting for work.
    // 2. newCacheThreadPool -- it doesn't take numberOfThread argument when creating an ExecutorService. It also doesn't use BLOCKING QUEUE to hold task.
    //                          instead, whenever a task is submitted, it tries to assign a thread from pool the task or create a new thread and assign the task to it.
    //                          It uses a synchronous queue with single slot.
    //                          Once the work is done, and the no more task are assigned to the thread, the service kills the threads that are alive & idle for more than 60 seconds.
    // 3. scheduledThreadPool -- schedules all the task to run based on a time delay. The tasks are placed in a queue called the DELAY QUEUE.
    // ScheduledService service = Executors.newScheduledThreadPool(10);
    // Run task after 10 SECONDS
    // service.schedule(new Task(), 10, SECONDS)
    // Run a repeated task every 15 SECONDS with an initial delay of 10
    // service.scheduleAtFixedRate(new Task(), initialDelay:10, interval: 15, SECONDS)
    // Run a task repeatedly every 15 SECONDS after the previous task completes.
    // service.scheduleWithFixedDelay(new Task(), initialDelay: 10, interval: 15, SECONDS)
    //
    // In cases when tasks need to be run in a sequential order, task1, task2, task3, task4, task5 we can use: SingleThreadExecutor
    // 4. SingleThreadExecutor
    // service = Executors.newSingleThreadExecutor()
    // Has only one thread, and uses the same BLOCKING QUEUE. Guarantees sequential execution.
}
