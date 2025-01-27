package example;

import java.util.Scanner;

public class MyNameIs {
      public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String text  = "My name is <Test>";
            System.out.print("Enter the replacement text: ");
            String replacement = scanner.nextLine();
            String updatedText = text.replace("<Test>", replacement);
            System.out.println("Updated text: " + updatedText);

            System.out.print("Enter the first string: ");
            String string1 = scanner.nextLine();
            System.out.print("Enter the second string: ");
            String string2 = scanner.nextLine();
            if (string1.equals(string2)) {
                  System.out.println("The strings are identical.");
            } else {
                  System.out.println("The strings are not identical.");
            }

            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            System.out.println("The sentence contains " + words.length + " words. ");

            System.out.print("Enter the first string for concatenation: ");
            String str1 = scanner.nextLine();
            System.out.print("Enter the second string for concatenation: ");
            String str2 = scanner.nextLine();
            String concatenadedString = str1 + " " + str2;
            System.out.println("Concatenaded string: " + concatenadedString);

            scanner.close();
      }
}
