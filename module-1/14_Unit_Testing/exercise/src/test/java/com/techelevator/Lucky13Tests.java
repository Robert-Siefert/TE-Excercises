package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {
    /*
     * Given an array of ints, return true if the array contains no 1's and no 3's.
     * GetLucky([0, 2, 4]) → true GetLucky([1, 2, 3]) → false GetLucky([1, 2,
     * 4]) → false
     */
    Lucky13 lucky13 = new Lucky13();

    @Test
    public void testLuckyNumbers(){
        int[] testArray = new int[3];
        testArray[0] = 0;
        testArray[1] = 2;
        testArray[2] = 4;
        Assert.assertTrue(lucky13.getLucky(testArray));
        testArray[0] = 1;
        testArray[1] = 2;
        testArray[2] = 3;
        Assert.assertFalse(lucky13.getLucky(testArray));
        testArray[2] = 4;
        Assert.assertFalse(lucky13.getLucky(testArray));
    }

}
