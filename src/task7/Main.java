package task7;

public class Main {
    public static void main(String[] args) {
     Employee manager = new Manager(100, "Bob",  8);
     Employee director = new Director(100, "Kate", 30);
     System.out.println(manager);
     System.out.println(director);

    }
}
