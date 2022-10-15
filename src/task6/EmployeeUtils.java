package task6;

public class EmployeeUtils {

    public static Employee findEmployeeName(Employee[] employees, String name){
        return findEmployeeByName(employees, name);
    }

    public static Employee findEmployeeByName(Employee[] employees, String name) {
        Employee emp = null;
        for (Employee employee:employees) {
            if (employee != null && employee.getName().matches(".*" + name + ".*")) {
                emp = employee;
            }
        }
        return emp;
    }

    public static int findSumAllSalary(Employee[] employees) {
        return SalaryUtils.getSum(employees);
    }

    public static int findMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (Employee employee: employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }

        return minSalary;
    }

    public static int findMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        for (Employee employee: employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }

        return maxSalary;
    }
}
