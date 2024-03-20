package practical_tasks.pt3.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {
    private String name;
    private double rate;
    private double hours;
    public static double totalSum;

    public static double getSalary(Employee employee) {
        double salary = employee.getRate() * employee.getHours();
        totalSum += salary;
        return salary;
    }

    public static double getBonus(Employee employee) {
        return (employee.getRate() * employee.getHours()) * 0.1;
    }
}
