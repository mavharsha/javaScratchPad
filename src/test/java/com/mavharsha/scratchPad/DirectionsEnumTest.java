package com.mavharsha.scratchPad;

import org.junit.Test;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import static org.junit.Assert.assertEquals;

public class DirectionsEnumTest {

    @Test
    public void testTravellingNorth() {
        assertEquals(Directions.NORTH, Directions.NORTH.move());
    }

    @Test
    public void testNorthTitle() {
        assertEquals(Directions.NORTH.getTitle(), "North");
     }

     @Test
    public void testSingletonBehaviour(){
        Directions first = Directions.NORTH;
        Directions second = Directions.NORTH;
        Directions third = Directions.NORTH;

         System.out.println(first.hashCode());
         System.out.println(second.hashCode());
         System.out.println(third.hashCode());
        assertEquals(first, second);
        assertEquals(first, third);
     }
}
