package example;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
        }

        System.out.println("Array with 20 elements (index * 5):");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        double average = calculateAverage(arr);
        System.out.println("Average of the array elements: " + average);

        sumEvenOdd(arr);

        System.out.print("\nEnter a number N to print numbers from 1 to N: ");
        int N = scanner.nextInt();
        printNumbers(1, N);

        System.out.print("\nEnter a number N to print numbers from 1 to N that are not divisible by 3 or 7: ");
        N = scanner.nextInt();
        printNotDivisibleBy3Or7(N);

        System.out.print("\nEnter a number N to calculate the sum of the first N Fibonacci numbers: ");
        N = scanner.nextInt();
        System.out.println("Sum of the first " + N + " Fibonacci numbers: " + sumFibonacci(N));
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void sumEvenOdd(int[] arr) {
        int evenSum = 0, oddSum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printNotDivisibleBy3Or7(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int sumFibonacci(int N) {
        int sum = 0;
        int a = 0, b = 1;
        for (int i = 1; i <= N; i++) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }
}

