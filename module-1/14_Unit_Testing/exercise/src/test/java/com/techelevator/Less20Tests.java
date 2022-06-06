package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {
        /*
         Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
         and 39 return true, but 40 returns false.
         (Hint: Think "mod".)
         less20(18) → true
         less20(19) → true
         less20(20) → false
     */

    Less20 less20 = new Less20();

    @Test
    public void testNormalNumbers(){
        Assert.assertTrue(less20.isLessThanMultipleOf20(19));
        Assert.assertTrue(less20.isLessThanMultipleOf20(38));
        Assert.assertFalse(less20.isLessThanMultipleOf20(40));
        Assert.assertFalse(less20.isLessThanMultipleOf20(60));
    }
    @Test
    public void testWeirdNumbers(){
        Assert.assertFalse(less20.isLessThanMultipleOf20(0));
        Assert.assertFalse(less20.isLessThanMultipleOf20(-6));
        Assert.assertFalse(less20.isLessThanMultipleOf20(-41));
    }
}
