package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    /*
     Given an array of ints, return true if the array is length 1 or more, and the first element and
     the last element are equal.
     IsItTheSame([1, 2, 3]) → false
     IsItTheSame([1, 2, 3, 1]) → true
     IsItTheSame([1, 2, 1]) → true
     */

    SameFirstLast sameFirstLast = new SameFirstLast();

    @Test
    public void testFirstAndLastSame() {
        int[] testArray = new int[]{1, 2, 3, 1};
        int[] testArray2 = new int[]{1, 2, 1};
        int[] testArray3 = new int[]{7};
        Assert.assertTrue(sameFirstLast.isItTheSame(testArray));
        Assert.assertTrue(sameFirstLast.isItTheSame(testArray2));
        Assert.assertTrue(sameFirstLast.isItTheSame(testArray3));
    }

    @Test
    public void testFirstAndLastDifferent() {
        int[] testArray = new int[]{1, 2, 3};
        Assert.assertFalse(sameFirstLast.isItTheSame(testArray));
        Assert.assertFalse(sameFirstLast.isItTheSame(null));


    }
}
