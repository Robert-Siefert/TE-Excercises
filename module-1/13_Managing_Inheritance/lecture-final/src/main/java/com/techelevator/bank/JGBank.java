package com.techelevator.bank;

import java.util.ArrayList;
import java.util.List;

public class JGBank {

    public static void main(String[] args) {

       // Account a = new Account();
        Account savings = new Savings();
        savings.setAccountNumber("1234");
        savings.setBalance(100.00);
       //Checking checking = new Checking();
        MoneyMarketChecking mmc = new MoneyMarketChecking();
        mmc.setAccountNumber("12345555");
        mmc.setBalance(1000.00);



        List<Account> myAccounts = new ArrayList<Account>();
        myAccounts.add(savings);
        myAccounts.add(mmc);

        for (Account a : myAccounts) {
            a.printStatement();;
        }







    }

}
