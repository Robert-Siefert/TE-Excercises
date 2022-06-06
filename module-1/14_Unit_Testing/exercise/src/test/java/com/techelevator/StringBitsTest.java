package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
/*
 * Given a string, return a new string made of every other char starting with
 * the first, so "Hello" yields "Hlo". GetBits("Hello") → "Hlo" GetBits("Hi")
 * → "H" GetBits("Heeololeo") → "Hello"
 */
public class StringBitsTest {
    StringBits stringBits = new StringBits();
    @Test
    public void testOneLetter(){
        Assert.assertEquals("H",stringBits.getBits("H"));
    }

    @Test
    public void testHello(){
        Assert.assertEquals("HLO",stringBits.getBits("HELLO"));
    }

    @Test
    public void testNull(){
        Assert.assertEquals("",stringBits.getBits(null));
    }
}
