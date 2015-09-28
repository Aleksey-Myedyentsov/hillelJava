package Homework;

import java.util.Scanner;

/**
 * Created by User on 27.09.2015.
 */
public class NearestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int max = 0;
        int min = 0;

        System.out.println("Enter any number");
        num = scanner.nextInt();

        System.out.println("Enter the number < " + num);
        min = scanner.nextInt();
        while (min >= num) {
            System.out.println("Please enter a number less than " + num);
            min = scanner.nextInt();
        }

        System.out.println("Enter the number > " + num);
        max = scanner.nextInt();
        while (max <= num) {
            System.out.println("Please enter a number more than " + num);
            max = scanner.nextInt();
        }

        if ((num - min) == (max - num)) {
            System.out.println("values are equally close to the number " + num);
        } else {

            if ((num - min) < (max - num)) {
                System.out.println("Number " + min + " more closer than " + max);
            } else {
                System.out.println("Number " + max + " more closer than " + min);
            }
        }
    }
}


