package task7;

class Director extends Manager{

    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        return this.getNumberOfSubordinates() == 0 ? getBaseSalary() :
                getBaseSalary() +  ((getBaseSalary() * getNumberOfSubordinates()) / 100) * 9;
    }
    @Override
    public String toString(){
        return "" + getName()
                + " salary: " + getSalary();
    }
}
