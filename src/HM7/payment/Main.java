package HM7.payment;

public class Main {
    public static void main(String[] args) {
        Employee[] empls = {
                new ContractEmployee("1e34r5", "Oleg", "1234-5678"),
                new SalariedEmployee("3k45l32", "Andrey", 72, "236784345"),
                new SalariedEmployee("345h56h", "Sunya", 80, "457895435")
        };
        for (Employee object : empls) {
            if (object instanceof ContractEmployee) {
                System.out.println("Employee name: " + object.getName() + "\nEmployee ID: "
                        + object.getEmployeeId() +
                        "\nFederal number: " + ((ContractEmployee) object).getFederalTaxiIDMember()
                        + "\nAverage monthly wage: ");
                ((ContractEmployee) object).calculatePay();
            } else {
                System.out.print("Employee name: " + object.getName() + "\nEmployee ID: "
                        + object.getEmployeeId() + "\nSocial number: "
                        + ((SalariedEmployee) object).getSocialSecurityNum()
                        + "\nAverage monthly wage: ");
                ((SalariedEmployee) object).calculatePay();

            }
        }
    }
}
