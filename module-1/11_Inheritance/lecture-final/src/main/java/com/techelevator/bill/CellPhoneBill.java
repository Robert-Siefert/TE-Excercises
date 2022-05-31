package com.techelevator.bill;

public class CellPhoneBill extends Bill {

    private int usageHours;

    public CellPhoneBill(String accountNumber) {
        super(accountNumber, 100);
    }


    public int getUsageHours() {
        return usageHours;
    }

    public void setUsageHours(int usageHours) {
        this.usageHours = usageHours;
    }

    public void addToBill(double amountToAdd, int daysLate) {

        if (daysLate > 3) {
            amountToAdd = amountToAdd + 10.00;
        }
        super.addToBill(amountToAdd);

    }


    public void printBill () {

        System.out.println("Cellular Account Number: " + getAccountNumber() + " Balance Due Upon Receipt: " + getBalance() );

    }

    public String toString() {

        return "Values: " + getBalance() + " " + getUsageHours() + " " + getAccountNumber();
    }

}
