package homework7.hw7_task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("250",10000, "Ivan","35",50,8),
                new SalariedEmployee("260",20000,"Julia","550"),
                new ContractEmployee("270",15000,"Anna","24",30,5),
                new SalariedEmployee("280",13000,"Lorando","13")
        };
        Arrays.sort(employees);
        for(var employee : employees){
            if(employee instanceof SalariedEmployee){
                System.out.println(employee);
            }else if(employee instanceof ContractEmployee){
                System.out.println(employee);
            }
        }
    }
}
