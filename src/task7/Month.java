package task7;

class Month {
    private String monthName;
    private int countOfDays;
    private int countOfWorkingDays;

    public Month(String monthName, int countOfDays, int countOfWorkingDays) {
        this.monthName = monthName;
        this.countOfDays = countOfDays;
        this.countOfWorkingDays = countOfWorkingDays;
    }

    public Month() {
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public int getCountOfWorkingDays() {
        return countOfWorkingDays;
    }

    public void setCountOfWorkingDays(int countOfWorkingDays) {
        this.countOfWorkingDays = countOfWorkingDays;
    }
}
