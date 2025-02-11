package example;

import java.util.Scanner;

public class ReadingFromConsole {

    public static void main(String[] args) {
        //Print the text in the console
        System.out.println("Please fill in name:");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Do you have any hobbies:");
        String hobby = scanner.nextLine();
        System.out.println("Your hobby is " + hobby + "!" + "Wonderful, " + userName + "!");
    }
}
