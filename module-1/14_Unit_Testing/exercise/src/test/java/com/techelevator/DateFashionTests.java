package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {
    /*
    You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
    of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
    getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very
    stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of
    2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
    dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
    */
    DateFashion dateFashion = new DateFashion();

    @Test
    public void testUnacceptableAttire(){
        Assert.assertEquals(0,dateFashion.getATable(1,1));
        Assert.assertEquals(0,dateFashion.getATable(1,10));
        Assert.assertEquals(0,dateFashion.getATable(2,7));
        Assert.assertEquals(0,dateFashion.getATable(9,2));
        Assert.assertEquals(0,dateFashion.getATable(8,1));
    }
    @Test
    public void testExceptionalAttire(){
        Assert.assertEquals(2,dateFashion.getATable(10,10));
        Assert.assertEquals(2,dateFashion.getATable(5,10));
        Assert.assertEquals(2,dateFashion.getATable(4,8));
        Assert.assertEquals(2,dateFashion.getATable(9,5));
        Assert.assertEquals(2,dateFashion.getATable(8,4));
    }
    @Test
    public void testQuestionableAttire(){
        Assert.assertEquals(1,dateFashion.getATable(5,5));
        Assert.assertEquals(1,dateFashion.getATable(6,3));
        Assert.assertEquals(1,dateFashion.getATable(4,7));

    }

}
