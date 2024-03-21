package edu07.monthlywage;

public class Main {
    public static void main(String[] args) {
        Employee[] empls = {
                new ContractEmployee("123-767", "Josephina", "1234-675"),
                new SalariedEmployee("3478632-34578654", "Vasilii", "1234", 124),
                new SalariedEmployee("1234", "Djigan", "1234567", 72)};

        for (Employee object : empls) {
            if (object instanceof ContractEmployee) {
                System.out.print("Employee name: " + object.getName() + "\nEmployee ID: " + object.getEmployeeId() + "\nFederal number: " + ((ContractEmployee) object).getFederalTaxIdMember() + "\nAverage monthly wage: ");
                ((ContractEmployee) object).calculatePay();
            } else {
                System.out.print("Employee name: " + object.getName() + "\nEmployee ID: " + object.getEmployeeId() + "\nSocial number: " + ((SalariedEmployee) object).getSocialSecurityNumber() + "\nAverage monthly wage: ");
                ((SalariedEmployee) object).calculatePay();
            }
            System.out.println("\n-------------------------------------------------------");
        }


    }
}