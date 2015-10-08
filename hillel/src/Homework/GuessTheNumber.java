package Homework;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by User on 04.10.2015.
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNum = 5;//random.nextInt(11);
        int i = 0;

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        do {
            if (randNum < number) {
                System.out.println("Your number > randomnumber, enter your number again");
                number = scanner.nextInt();
            } else if (randNum > number) {
                System.out.println("Your number < randomnumber, enter your number again");
                number = scanner.nextInt();
            }
            i++;
        } while (!(randNum == number));

        System.out.println("You guessed on the " + i + " attempt");
    }
}
