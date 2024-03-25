package edu07.HomeWork01;

public class ContractEmployee extends Employee implements Payment {
    @Override
    public double calculatePay() {
        return 0;
    }
}
