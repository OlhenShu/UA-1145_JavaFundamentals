package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("241", "1", 50000),
                new ContractEmployee("542", "1", 400, 100 ),
                new SalariedEmployee("111", "2", 35000),
                new ContractEmployee("318", "51", 500, 90)
        };

        Arrays.sort(employees, new PaymentComparator());

        for(var employee : employees) {
            System.out.println(employee.output());;
        }
    }
}
