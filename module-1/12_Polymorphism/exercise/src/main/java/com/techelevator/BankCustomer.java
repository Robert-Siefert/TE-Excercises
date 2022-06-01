package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String phoneNumber;
    private String address;
    List<Accountable> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[accounts.size()]);
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public boolean isVip() {
        int totalAccountBalance = 0;
        for (Accountable account : accounts) {
            totalAccountBalance += account.getBalance();
        }
        if (totalAccountBalance >= 25000) {
            return true;
        } else {
            return false;
        }

    }
}
