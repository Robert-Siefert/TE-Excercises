package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {
    /*
     * Given an array of strings, return a Map<String, Integer> with a key for
     * each different string, with the value the number of times that string appears
     * in the array.
     *
     * ** A CLASSIC **
     *
     * getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
     * getCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
     * getCount([]) → {}
     * getCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}
     *
     */

    WordCount wordCount = new WordCount();

    @Test
    public void testNull(){
       Map<String,Integer> testMap = new HashMap<>();
        Assert.assertEquals(testMap,wordCount.getCount(null));
    }
    @Test
    public void testSheep(){
        String[] testArray = new String[]{"ba", "ba","black","sheep"};
        Assert.assertEquals((Integer)2,wordCount.getCount(testArray).get("ba"));
        Assert.assertEquals((Integer)1,wordCount.getCount(testArray).get("black"));
        Assert.assertEquals((Integer)1,wordCount.getCount(testArray).get("sheep"));
    }

}
