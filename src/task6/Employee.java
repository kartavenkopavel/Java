package task6;

import task5.Person;
import java.util.Objects;

public class Employee extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, char sex, int yearOfBirth, int salary) {
        super(name, sex, yearOfBirth);
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
        return Objects.equals(this.getName(), employee.getName());
    }
    @Override
    public String getName(){
        if (getSex().equals("Male")) {
            return "Mr. " + super.getName();
        } else if (getSex().equals("Female")) {
            return "Ms. " + super.getName();
        } else {
            return super.getName();
        }
    }

    @Override
    public String toString() {
        return getName() + ":("
                + "sex: " + getSex()
                + ", age: " + getAge()
                + ", salary: " + salary + ")";

    }
}
