package com.techelevator.bill;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Application {


    public static void main(String[] args) {


        CableBill cableBill = new CableBill("1234", 79.00, "Basic Junk Plan");
        CellPhoneBill cellBill = new CellPhoneBill("123456");

        //we get billed
        cableBill.addToBill(100.00);
        cellBill.addToBill(400.00, 5);

//        cableBill.printBill();
//        cellBill.printBill();


//        System.out.println(cellBill.toString());
//        System.out.println(cableBill.toString());

        List<Bill> myBills = new ArrayList<>();
        myBills.add(cableBill);
        myBills.add(cellBill);

        for (Bill bill : myBills) {
           // bill.printBill();
            System.out.println(bill.toString());

            if (bill instanceof CellPhoneBill) {      // use with caution
                System.out.println(((CellPhoneBill) bill).getUsageHours());
            }
        }


        BigDecimal price = new BigDecimal(100.34);


        BigDecimal newPrices = price.add(new BigDecimal(1000.00));









    }
}
