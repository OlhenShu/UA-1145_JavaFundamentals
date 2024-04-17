package HomeWork07.Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("213", "Bob", 10000, "2412"),
                new SalariedEmployee("152", "Tom", 12000, "5254"),
                new ContractEmployee("513", "Ivan", "3255",
                        100, 150),
                new ContractEmployee("242", "Jacob", "2356",
                        105, 140)
        };
        Arrays.sort(employees);
        for (var employee : employees) {
            if (employee instanceof SalariedEmployee) {
                System.out.println(employee);
            } else if (employee instanceof ContractEmployee) {
                System.out.println(employee);
            }
        }
    }
}
