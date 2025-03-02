package methods;

public class NumberValidator {
    public static boolean checkNumbers(int num1, int num2, int num3) {
        if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
            return false;
        }

        return num1 == num2 && num2 == num3;
    }
}
