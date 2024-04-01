package edu10.Practical;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static java.lang.System.in;

public class Task2 {
    public static void main(String[] args) {
        var register = new EmployeeManagementSystem();
        register.run();
    }
}

class EmployeeManagementSystem {
    public EmployeeManagementSystem() {
        addEmployee(new Employee(
                1,
                "Alice",
                Position.DEV,
                10000,
                LocalDate.parse("1999-01-30")));
        addEmployee(new Employee(
                 2,
                 "Bob",
                 Position.QA,
                 10000,
                 LocalDate.parse("2000-03-30")));
    }

    private void addEmployee( Employee employee) {
        if (employees.containsKey(employee.id())) {
            throw new IllegalArgumentException("Employee with id = " + employee.id() + "already exist");
        }
        employees.put(employee.id(), employee);
    }

    private Map<Integer, Employee> employees = new HashMap<>();

    public void run() {
        out: while (true) {
            showMainMenu();
            int option = readOption(2);
            switch (option) {
                case 1 -> showEmployees();
                case 2 -> {
                    var employee = promptNewEmployee();
                    addEmployee(employee);
                }
                case 3 -> {
                    break out;
                }
            }
        }
        System.out.println("Bye!");
    }

    private int readIdForNewEmployee() {
        var SCANNER = new Scanner(System.in);

        while (true) {
            System.out.println("Enter id");
            int id = Integer.parseInt(SCANNER.nextLine());
            if (employees.containsKey(id)) {
                return id;
            }
            System.out.println("Such id is already occupied, choose another one");
        }
    }

    private Employee promptNewEmployee() {
        var SCANNER = new Scanner(in);
        System.out.println("Let's add new employee");
        int id = readIdForNewEmployee();
        System.out.println("Enter name: ");
        String name = SCANNER.nextLine();
        Position position = readPosition();
        System.out.println("Enter salary: ");
        double salary = Double.parseDouble(SCANNER.nextLine());
        System.out.println("Enter DOB(in format 1999-01-30)");
        LocalDate dob = LocalDate.parse(SCANNER.nextLine().trim());
        return new Employee(
                id,
                name,
                position,
                salary,
                dob);
    }

    private Position readPosition() {
        var SCANNER = new Scanner(System.in);
        System.out.println("Enter Position: (one of "+
                Arrays.toString(Position.values()) + "):");
        var positionText = SCANNER.nextLine();
        return Position.valueOf(positionText.trim().toUpperCase());
    }

    private void showEmployees() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees yet");
        } else {
            for (var entry : employees.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    private int readOption(int nOptions){
        System.out.println("Enter option (1.." + nOptions + ")");
        var SCANNER = new Scanner(in);
        int res = Integer.parseInt(SCANNER.nextLine());
        return res;
    }

    private void showMainMenu() {
        System.out.println("""
                Main menu:
                1. Show employees
                2. Add  new employee
                3. Exit
                """);
    }
}

record  Employee (
        int id,
        String name,
        Position position,
        double salary,
        LocalDate dateOfBirth
) {
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

enum Position {
    DEV, QA, DEVOPS, MANAGER;
}