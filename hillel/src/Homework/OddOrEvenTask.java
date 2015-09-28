package Homework;

import java.util.Scanner;

/**
 * Created by User on 27.09.2015.
 */
public class OddOrEvenTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int remainder;

        System.out.println("Enter the number");
        int num = scanner.nextInt();
        remainder = num % 2;

        if (remainder == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("your number is odd");
        }
    }
}
