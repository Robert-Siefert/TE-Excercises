package com.techelevator.polymorphismbyinheritance;

import java.time.LocalDate;

public class Contractor extends Worker {

    private LocalDate startDate;
    private LocalDate endDate;
    private Company contractingCompany;

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Company getContractingCompany() {
        return contractingCompany;
    }

    public void setContractingCompany(Company contractingCompany) {
        this.contractingCompany = contractingCompany;
    }
}
