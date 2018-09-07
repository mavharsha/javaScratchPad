import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {

    @Test(expected = IllegalArgumentException.class)
    public void testRobThrowsExceptionWhenHouseValuesArrayIsNull() {
        HouseRobber.rob(null);
    }

    @Test
    public void testMaxLootWithZeroOrOneOrThreeHouse() {
        assertEquals(HouseRobber.rob(new int[]{}), 0);
        assertEquals(HouseRobber.rob(new int[]{2}), 2);
        assertEquals(HouseRobber.rob(new int[]{2, 3}), 3);
    }

    @Test
    public void testHouseRobberMaxLoot() {
        assertEquals(HouseRobber.rob(new int[]{1,2,3,1}), 4);
        assertEquals(HouseRobber.rob(new int[]{2,7,9,3,1}), 12);
    }
}