package cloudvandana;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: Rs." + salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Karthik Suresh", 65000));
        employees.add(new Employee(102, "Aswin Rajesh", 60000));
        employees.add(new Employee(103, "Freddy Francis", 65000));

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
