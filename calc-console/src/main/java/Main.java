import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введіть друге число:");
        double num2 = scanner.nextDouble();

        System.out.println("Введіть оператор (+, -, *, /):");
        String operator = scanner.next();

        Calc calculator = new CalculatorFunctions();
        double result = 0;

        try {
            switch (operator) {
                case "+":
                    result = calculator.addition(num1, num2);
                    break;
                case "-":
                    result = calculator.subtraction(num1, num2);
                    break;
                case "*":
                    result = calculator.multiplication(num1, num2);
                    break;
                case "/":
                    result = calculator.division(num1, num2);
                    break;
                default:
                    System.out.println("Невірний оператор. Використовуйте +, -, *, /");
                    return;
            }

            System.out.printf("number1=%.2f number2=%.2f operator=%s result=%.2f%n", num1, num2, operator, result);

        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}