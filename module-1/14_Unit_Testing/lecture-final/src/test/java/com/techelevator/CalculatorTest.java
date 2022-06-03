package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {

        // if you have something you want to create and use in every test
        calculator = new Calculator();
    }

    @Test
    public void test_adding_two_integers() {

        //arrange  - don't need for this test case (calculator is already created in setup)

        //act and assert on same line (act - calling the method, assert is seeing if expected result = actual result)
        Assert.assertEquals(4,  calculator.add(2,2));
        Assert.assertEquals(2,  calculator.add(0,2));
        Assert.assertEquals(2,  calculator.add(2,0));
        Assert.assertEquals(5,  calculator.add(7,-2));
        Assert.assertEquals(-9,  calculator.add(-7,-2));
    }

    @Test
    public void testIfAIsGreaterThanB() {

        //arrange is not needed

        Assert.assertTrue(calculator.isAGreaterThanB(7,3));
        Assert.assertFalse(calculator.isAGreaterThanB(2, 4));
        Assert.assertFalse(calculator.isAGreaterThanB(3,3));
        Assert.assertTrue(calculator.isAGreaterThanB(-2, -5));

    }

    @Test
    public void testIfDivisibleBy3isFizz() {

        Assert.assertEquals("fizz", calculator.fizzBuzz(3));
        Assert.assertEquals("fizz", calculator.fizzBuzz(9));

    }


    @Test
    public void testIfDivisibleBy5isBuzz() {

        Assert.assertEquals("buzz", calculator.fizzBuzz(5));
        Assert.assertEquals("buzz", calculator.fizzBuzz(10));

    }


    @Test
    public void testIfDivisibleBy5And3isFizzBuzz() {

        Assert.assertEquals("fizzbuzz", calculator.fizzBuzz(30));
        Assert.assertEquals("fizzbuzz", calculator.fizzBuzz(15));

    }

    @Test
    public void testIsNotDivisibleBy5AndOr3isANumber() {

        Assert.assertEquals("11", calculator.fizzBuzz(11));
        Assert.assertEquals("23", calculator.fizzBuzz(23));

    }



    public void testForNull(){

        Assert.assertNull(calculator.returnNull());

    }

    @Test
    public void testWrappedObjectAddition() {

        //Arrange
        WrappedNumbers one = new WrappedNumbers(5,6);


        //Act and Assert
        Result resultOne = calculator.add(one);
        Assert.assertEquals(11, resultOne.getResult());
    }



//    @Test
//    public void testSomethingThatDoesNothing() {
//
//
//        System.out.println("I am a test");
//    }
//
//    @Test
//    public void testSomethingEquallyStupid() {
//        System.out.println("I am another test");
//    }
//
//
//    @After
//    public void teardown() {
//
//        // if you have something you want to create and use in every test
//        System.out.println("I am a after method");
//    }



}
