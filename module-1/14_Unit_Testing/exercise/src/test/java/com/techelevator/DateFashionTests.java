package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {
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
