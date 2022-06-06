package com.techelevator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AnimalGroupNameTests {

    AnimalGroupName animalGroupName = new AnimalGroupName();

    @Test
    public void testGroupNameLowerCase(){

        Assert.assertEquals("Crash",animalGroupName.getHerd("rhino"));
    }
    @Test
    public void testGroupNameUpperCase(){

        Assert.assertEquals("Tower",animalGroupName.getHerd("GIRAFFE"));
    }
    @Test
    public void testGroupNameMixedCase(){

        Assert.assertEquals("Pride",animalGroupName.getHerd("lIoN"));
    }
    @Test
    public void testUnknowns(){
        Assert.assertEquals("unknown",animalGroupName.getHerd(null));
        Assert.assertEquals("unknown",animalGroupName.getHerd(""));
        Assert.assertEquals("unknown",animalGroupName.getHerd("Gazorpazorp"));
    }


}
