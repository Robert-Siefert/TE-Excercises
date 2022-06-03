package com.techelevator.polymorphismbyinheritance;

import java.time.LocalDate;

public class Employee extends Worker{

    private LocalDate hireDate;

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
