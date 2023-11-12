package calculator;

public class Calculation {
    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
            e.getMessage();
        }
        return 0;
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }
}
