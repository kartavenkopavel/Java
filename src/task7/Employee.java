package task7;

abstract class Employee {
    private int baseSalary;
    private String name;
    private  int salary;

    public Employee(int baseSalary, String name, int salary) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
        name = null;
        baseSalary = 0;
        salary = 0;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    abstract int getSalary();


}
