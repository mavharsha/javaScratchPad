package com.mavharsha.scratchPad;

import java.util.stream.IntStream;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        //IntStream.range(1,10).forEach(System.out::print);
        int i = 0;
        while(i < 10) {
            System.out.print(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
