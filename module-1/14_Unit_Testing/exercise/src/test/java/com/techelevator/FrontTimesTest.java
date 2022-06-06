package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {
    /*
     * Given a string and a non-negative int n, we'll say that the front of the
     * string is the first 3 chars, or whatever is there if the string is less than
     * length 3. Return n copies of the front; frontTimes("Chocolate", 2) →
     * "ChoCho" frontTimes("Chocolate", 3) → "ChoChoCho" frontTimes("Abc", 3) →
     * "AbcAbcAbc"
     */
    FrontTimes frontTimes = new FrontTimes();

    @Test
    public void testSmallWords() {
        Assert.assertEquals("asasas", frontTimes.generateString("as", 3));
        Assert.assertEquals("iiii", frontTimes.generateString("i", 4));
        Assert.assertEquals("", frontTimes.generateString("", 4));
    }

    @Test
    public void testNullEntry() {
        Assert.assertEquals("", frontTimes.generateString(null, 4));
    }

    @Test
    public void testGoodWords() {
        Assert.assertEquals("eleeleele", frontTimes.generateString("electric", 3));
        Assert.assertEquals("pumpum", frontTimes.generateString("pumpkin", 2));
        Assert.assertEquals("lollollollollol", frontTimes.generateString("lollipop", 5));

    }
}
