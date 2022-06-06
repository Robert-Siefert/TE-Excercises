package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests {
     /*
     Given an array of ints length 3, figure out which is larger between the first and last elements
     in the array, and set all the other elements to be that value. Return the changed array.
     MakeArray([1, 2, 3]) → [3, 3, 3]
     MakeArray([11, 5, 9]) → [11, 11, 11]
     MakeArray([2, 11, 3]) → [3, 3, 3]
     */
    MaxEnd3 maxEnd3 = new MaxEnd3();
    @Test
    public void testSimpleNumbers(){
        int[] testArray = new int[]{1,2,3};
        int[] comparisonArray = new int[]{3,3,3};

        Assert.assertArrayEquals(comparisonArray, maxEnd3.makeArray(testArray));
        testArray[0] = 1;
        testArray[1] = 11;
        testArray[2] = 3;

        comparisonArray[0] = 3;
        comparisonArray[1] = 3;
        comparisonArray[2] = 3;
        Assert.assertArrayEquals(comparisonArray, maxEnd3.makeArray(testArray));
        testArray[0] = 11;
        testArray[1] = 5;
        testArray[2] = 9;

        comparisonArray[0] = 11;
        comparisonArray[1] = 11;
        comparisonArray[2] = 11;
        Assert.assertArrayEquals(comparisonArray, maxEnd3.makeArray(testArray));
    }
    @Test
    public void testNegativeNumbers(){
        int[] testArray = new int[]{-1,2,-3};
        int[] comparisonArray = new int[]{-1,-1,-1};


        Assert.assertArrayEquals(comparisonArray, maxEnd3.makeArray(testArray));

    }
}
