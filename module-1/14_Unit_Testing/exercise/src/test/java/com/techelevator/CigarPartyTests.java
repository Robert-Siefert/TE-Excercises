package com.techelevator;
import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {
 //   When squirrels get together for a party, they like to have cigars. A squirrel party is successful
 //   when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
 //   there is no upper bound on the number of cigars. Return true if the party with the given values is
 //   successful, or false otherwise

    CigarParty cigarParty = new CigarParty();


    @Test
    public void testTooManyCigars(){
        Assert.assertTrue(cigarParty.haveParty(100,true));
        Assert.assertFalse(cigarParty.haveParty(100,false));
    }
    @Test
    public void testNotEnoughCigars(){
        Assert.assertFalse(cigarParty.haveParty(5,true));
        Assert.assertFalse(cigarParty.haveParty(5,false));
    }
    @Test
    public void testJustRightNumberOfCigarsForAwesomeSquirrelParties(){
        Assert.assertTrue(cigarParty.haveParty(40,false));
        Assert.assertTrue(cigarParty.haveParty(50,false));
        Assert.assertTrue(cigarParty.haveParty(60,false));
    }

}
