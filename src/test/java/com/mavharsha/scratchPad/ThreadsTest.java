package com.mavharsha.scratchPad;

import org.junit.Test;

import java.util.stream.IntStream;

public class ThreadsTest {

    @Test
    public void createThreadWithRunnable() {
        System.out.println(Thread.currentThread().getName());   //
        Runnable runnable = () -> System.out.println( Thread.currentThread().getName());
        Thread thread = new Thread(runnable);
        thread.setName("SuperGenericThreadDoingNetworkCall");
        thread.start();
        Thread threadTou = new Thread(runnable, "AnotherSuperGenericThreadDoingDatabaseLookUp");
        threadTou.start();
    }

    @Test
    public void createASimpleThread() throws InterruptedException {
       Thread simpleThread = new SimpleThread();
        System.out.println(simpleThread.getState());
       simpleThread.start();
    }
}
