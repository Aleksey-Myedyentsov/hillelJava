package Homework;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by User on 30.09.2015.
 */
public class Calculator {
    public static void main(String[] args) {
        double res = 0.0;

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double firstNum = scanner.nextDouble();

        System.out.println("Enter a sign of operation: +, -, *, /, trunk, fract");
        String operation = scanner.next();

        if (operation.equals("trunk")) {
            int resTrunk = (int) firstNum;
            System.out.println(resTrunk);
        } else {
            if (operation.equals("fract")) {
                double resFract = firstNum % 1;
                System.out.println(resFract);
            } else {

                System.out.println("Enter the second number:");
                double secondNum = scanner.nextDouble();

                switch (operation) {
                    case "+":
                        res = firstNum + secondNum;
                        break;
                    case "-":
                        res = firstNum - secondNum;
                        break;
                    case "*":
                        res = firstNum * secondNum;
                        break;
                    case "/":
                        res = firstNum / secondNum;
                        break;
                    default:
                        System.out.println("An incorrect value");
                        break;
                }
                System.out.println(res);
            }
        }
    }
}