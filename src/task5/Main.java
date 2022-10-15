package task5;

import task6.Employee;
import task6.EmployeeUtils;
import task6.SalaryUtils;

public class Main {
    public static void printTaskNumber(int num) {
        System.out.println("=====Task# " + num + "=====");
    }

    public static void main(String[] args) {
        Person pavel = new Person("Pavel", 'M', 1990);

        System.out.println(String.format("Name: %s, age: %d", pavel.getName(), pavel.getAge()));

        printTaskNumber(3);
        Employee emp = new Employee("John", 'M', 1920, 12002);
        Employee emp2 = new Employee("John", 'M', 1989, 12918);
        Employee epm3 = new Employee("Kate", 'F', 1934, 912918);
        Employee emp4 = new Employee("Bob", 'T', 1955, 291012);

        System.out.println(emp.isSameName(emp4));

        printTaskNumber(4);
        Employee[] employees = {emp, emp2, epm3, emp4};
        System.out.println(SalaryUtils.getSum(employees));

        printTaskNumber(5);
        System.out.println(EmployeeUtils.findEmployeeName(employees,"Bob"));
        System.out.println(EmployeeUtils.findEmployeeByName(employees, "K"));
        System.out.println(EmployeeUtils.findSumAllSalary(employees));
        System.out.println(EmployeeUtils.findMinSalary(employees));
        System.out.println(EmployeeUtils.findMaxSalary(employees));

    }
}
