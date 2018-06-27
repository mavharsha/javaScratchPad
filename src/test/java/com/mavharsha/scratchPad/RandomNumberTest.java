package com.mavharsha.scratchPad;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class RandomNumberTest {

    @Test
    public void testRandomNumber(){
        /* When the empty constructor is used, it uses a seed
        *  which is XORed the current time to the nanosecond */
        Random random = new Random();
        assertNotNull(random.nextInt());
    }


    @Test
    public void testRandomNumberWithSeed(){
        Random random = new Random(100);
        assertNotNull(random.nextInt());
    }

    @Test
    public void testRandomNumberGenerationWithMathRandom(){
        /* Generating random number by calling static method
         * random on Math.class */
        assertNotNull(Math.random());
    }

    @Test
    public void testRandomNumberGenerationWithThreadLocalClass(){
        /* Generating random number by using ThreadLocalRandom */

        assertNotNull(ThreadLocalRandom.current().nextInt());
        assertNotNull(ThreadLocalRandom.current().nextDouble());
    }

    @Test
    public void testGetFirstRandomNumberFromStream(){
        /* Generating random number stream by using ThreadLocalRandom */
        IntStream stream = ThreadLocalRandom.current().ints();
        Optional<Integer> single = stream.boxed()
                .map(Integer::new)
                .filter((x) -> x % 2 == 0)
                .findFirst();
        assertNotNull(single.get());
        if(single.get() != null) {
            assertNotNull(single.get());
        }

        DoubleStream doubleStream = ThreadLocalRandom.current().doubles();
        Optional<Double> singleDouble = doubleStream.boxed()
                .map(Double::new)
                //.filter((Double x) -> (x % 2.0 == 0))
                .findFirst();
        assertNotNull(singleDouble.get());
        if(singleDouble.get() != null) {
            assertNotNull(singleDouble.get());
        }
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testGenerateFirst100RandomNumbers(){
        /* Generating random number stream by using ThreadLocalRandom*/

        IntStream stream = ThreadLocalRandom.current().ints();
        List<Integer> list  = stream.boxed()
                //.map(Integer::new)
                .filter((x) -> x % 2 == 0)
                .limit(100)
                .collect(Collectors.toList());
        assertEquals(list.size(), 100);
        assertNotNull(list.get(0));
        assertNotNull(list.get(99));
        assertNull(list.get(100));
    }
}
