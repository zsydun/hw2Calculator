public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: number1 number2 operator");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        String operator = args[2];

        Calc calculator = new CalculatorFunctions();
        double result = 0;

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
                System.out.println("Invalid operator. Use +, -, *, /");
                return;
        }

        System.out.printf("number1=%f number2=%f operator=%s result=%f%n", num1, num2, operator, result);
    }
}
