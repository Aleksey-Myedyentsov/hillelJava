package Homework;

import java.util.Scanner;

/**
 * Created by User on 27.09.2015.
 */
public class H2Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int outNum;

        System.out.println("Enter the number");
        int num = scanner.nextInt();
        outNum = num % 2;

        if (outNum == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("your number is odd");
        }
    }
}
