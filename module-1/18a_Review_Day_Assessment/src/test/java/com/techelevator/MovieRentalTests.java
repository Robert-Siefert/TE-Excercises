package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MovieRentalTests {
    MovieRental movieRental = new MovieRental("test","DVD",false);
    @Test
    public void testRentalPrice(){
        Assert.assertEquals(1.99, movieRental.getRentalPrice());
    }
    @Test
    public void testLateFee(){
        Assert.assertEquals(0,movieRental.getLateFee(0));
        Assert.assertEquals(19.99,movieRental.getLateFee(42));

    }
}
