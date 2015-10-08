package Homework;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by User on 04.10.2015.
 */
public class Telegraph {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter price one word:");
        double price = scanner.nextDouble();

        System.out.println("Enter the text of message:");
        scanner.nextLine();
        String message = scanner.nextLine();
        //String message = "One Two";
        String words[] = message.split(" ");

        System.out.println("You need to pay: " + (words.length * price) + ", your message contains " + words.length + " word(s)");
    }
}

