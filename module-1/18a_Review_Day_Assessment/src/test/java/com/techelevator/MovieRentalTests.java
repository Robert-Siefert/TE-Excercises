package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MovieRentalTests {
    MovieRental movieRental = new MovieRental("test","DVD",false);
    @Test
    public void testRentalPrice(){
        Assert.assertEquals(1.99, movieRental.getRentalPrice(), 0.0001);
    }
    @Test
    public void testLateFee(){
        Assert.assertEquals(0,movieRental.getLateFee(0), 0.0001);
        Assert.assertEquals(19.99,movieRental.getLateFee(42), 0.0001);

    }
}
