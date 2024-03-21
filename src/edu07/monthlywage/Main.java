package edu07.monthlywage;

public class Main {
    public static void main(String[] args) {
        ContractEmployee cEmp = new ContractEmployee("Yes", "Contract Employee");
        SalariedEmployee sEmp = new SalariedEmployee("Yes", "123", 120);

        System.out.println("Contract Employee: \n" + "Employee ID: " + cEmp.getEmployeeld() + "\nID: " + cEmp.getFederalTaxIdMember() + "\n");
        cEmp.calculatePay();
        System.out.println("\n-----------------------------------------------------");
        System.out.println("Salaried Employee: \n" + "Employee ID: " + sEmp.getEmployeeld() + "\nSocial number: " + sEmp.getSocialSecurityNumber() + "\nHours: " + sEmp.getWorkHours() + "\n");
        sEmp.calculatePay();
        System.out.println("\n-----------------------------------------------------");
    }
}