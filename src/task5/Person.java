package task5;

import java.time.Year;

public class Person {
    private String name;
    private char sex;
    private int yearOfBirth;

    public String getSex() {
        if (sex == 'M') {
            return "Male";
        } else if (sex == 'F') {
            return "Female";
        } else {
            return "They";
        }
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return  currentYear - this.yearOfBirth;
    }

    public Person(String name, char sex, int yearOfBirth) {
        this.name = name;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName(){
       return name;
    }

}
