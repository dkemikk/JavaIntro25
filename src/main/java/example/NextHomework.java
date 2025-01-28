package example;

import java.util.Scanner;

public class NextHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("The largest number is: " + max);

        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();
        double perimeter = 2 * (length + height);
        double area = length * height;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        System.out.println("Enter a number between 1 and 12: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("You have selected 1. The month of the year is January.");
                break;
            case 2:
                System.out.println("You have selected 2. The month of the year is February.");
                break;
            case 3:
                System.out.println("You have selected 3. The month of the year is March.");
                break;
            case 4:
                System.out.println("You have selected 4. The month of the year is April.");
                break;
            case 5:
                System.out.println("You have selected 5. The month of the year is May.");
                break;
            case 6:
                System.out.println("You have selected 6. The month of the year is June.");
                break;
            case 7:
                System.out.println("You have selected 7. The month of the year is July.");
                break;
            case 8:
                System.out.println("You have selected 8. The month of the year is August.");
                break;
            case 9:
                System.out.println("You have selected 9. The month of the year is September.");
                break;
            case 10:
                System.out.println("You have selected 10. The month of the year is October.");
                break;
            case 11:
                System.out.println("You have selected 11. The month of the year is November.");
                break;
            case 12:
                System.out.println("You have selected 12. The month of the year is December.");
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }
}