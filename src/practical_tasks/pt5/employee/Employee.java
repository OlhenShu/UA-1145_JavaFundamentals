package practical_tasks.pt5.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Comparable<Employee>{
    private String name;
    private int department;
    private double salary;

    @Override
    public int compareTo(Employee other) {
        // Sort employees by salary in descending order
        return Double.compare(other.getSalary(), this.getSalary());
    }
}
