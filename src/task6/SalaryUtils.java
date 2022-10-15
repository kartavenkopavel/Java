package task6;

public class SalaryUtils{
    public static int getSum(Employee[] employeeArray) {
        int sum = 0;
        for (Employee employee : employeeArray) {
            sum += employee.getSalary();
        }

        return sum;
    }
}
