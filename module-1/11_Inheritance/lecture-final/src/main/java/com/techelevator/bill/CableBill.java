package com.techelevator.bill;

public class CableBill extends Bill  {


    private String planType;


    public CableBill(String accountNumber, double balance, String planType) {
        super(accountNumber, balance);
        this.planType = planType;
    }


    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String toString() {

        return "Values: " + getBalance() + " " + getPlanType() + " " + getAccountNumber();
    }

}
