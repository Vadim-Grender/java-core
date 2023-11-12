package calculator;

import calculator.Calculation;
import calculator.Output;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int result = 0;

        switch (operator) {
            case "+":
                result = Calculation.addition(num1, num2);
                break;
            case "-":
                result = Calculation.subtraction(num1, num2);
                break;
            case "*":
                result = Calculation.multiplication(num1, num2);
                break;
            case "/":
                result = Calculation.division(num1, num2);
                break;
            default:
                System.out.println("Ошибка: Неверный оператор");
        }

        System.out.println(Output.formatResult(result));

        scanner.close();
    }
}
