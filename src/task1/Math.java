package task1;

public class Math {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 7;
        int sum = num1 + num2;
        int mult = num1 * num2;
        int sub = num2 - num1;
        int div = num1 / num2;
        int dwr = num1 % num2;

        System.out.println(sum+"\n"+mult+"\n"+sub+"\n"+div+"\n"+dwr);

        String result1 = (num1 % 2 == 0) ? num1+" четное число" : num1+" нечетное число";
        String result2 = (num2 % 2 == 0) ? num2+" четное число" : num2+" нечетное число";

        System.out.println(result1+"\n"+result2);
    }
}
