package task7;

class Worker extends Employee {
    public Worker(String name, int salary) {
        super(name, salary);
    }
    @Override
    public int getSalary() {
        return getBaseSalary();
    }
    @Override
    public String toString() {
        return "" + super.getName()
                + " salary: " + getSalary();
    }
}
