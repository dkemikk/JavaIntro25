package example;

import java.util.Scanner;

public class ReadingFromConsole {

    public static void main(String[] args) {
        //Print the text in the console
        System.out.println("Please fill in name:");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Nice to meet you, " + userName + "!");
        System.out.println("Please enter your age:");
        int userAge = scanner.nextInt();
        System.out.println("What a wonderful age you have, " + userAge + "!");
        System.out.println("How many hobbies do you have:");
        int userHobby = scanner.nextInt();
        System.out.println(userHobby + "," + "Excellent, " + userName + "!");

    }
}
