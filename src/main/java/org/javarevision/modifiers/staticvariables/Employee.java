package org.javarevision.modifiers.staticvariables;

public class Employee {
    int employeeID;
    int salary;
    static int countOfEmployees;

    public Employee(int employeeID, int salary) {
        this.employeeID = employeeID;
        this.salary = salary;
        countOfEmployees++;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(100,2000);
        Employee emp2 = new Employee(100,2000);
        Employee emp3 = new Employee(100,2000);
        Employee emp4 = new Employee(100,2000);
        //emp1.employeeID
        System.out.println("Count of employees : " + Employee.countOfEmployees);
    }
}
