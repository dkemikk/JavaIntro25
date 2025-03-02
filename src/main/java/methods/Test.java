package methods;

public class Test {
    public static void main(String[] args) {

        String password = "Pass123!";
        System.out.println("Is valid password: " + PasswordValidator.isValidPassword(password));

        System.out.println("Are numbers positive and equal: " + NumberValidator.checkNumbers(5, 5, 5));

        double num1 = 10.0;
        double num2 = 20.0;

        double average = AverageCalculator.calculateAverage(num1, num2);
        System.out.println("Average: " + average);

        double sum = SumCalculator.calculateSum(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
