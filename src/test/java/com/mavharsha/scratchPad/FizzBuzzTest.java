package com.mavharsha.scratchPad;

import org.junit.Test;

import java.util.stream.IntStream;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzJava8(){

        IntStream.rangeClosed(0, 100).mapToObj(
                i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                        (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);

    }

    @Test
    public void testFizzBuzzJava7(){

       int i = 1;
       while(i <= 100) {
           System.out.println(i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : ""+i));
           i++;
       }

    }


}
