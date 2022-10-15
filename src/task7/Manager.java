package task7;

class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if ( this.numberOfSubordinates != 0) {
            return getBaseSalary() + ((getBaseSalary() * numberOfSubordinates) / 100) * 3;
        }
        else {
           return super.getBaseSalary();
        }
    }

    @Override
    public String toString() {
        return "" + super.getName()
                + " salary: " + getSalary();
    }
}
