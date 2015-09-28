import java.util.Scanner;

/**
 * Created by User on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args) {

        ternaryExample();

    }

    private static void ternaryExample() {
        int number = 5;
        String isEven = isEven(number);

        isEven = (number % 2 == 0) ? "yes" : "no"; //ternar operaitor
    }

    public static String isEven(int someNumber) {
        if (someNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    private static void swithCaseStringExample() {
        String month = "mar";
        switch (month) {
            case "jan":
            case "feb":
            case "dec":
                System.out.println("winter");
                break;
            case "mar":
            case "apr":
            case "may":
                System.out.println("spring");
                break;
            default:
                System.out.println("wrong month name: " + month);
                break;
        }
    }

    private static void switchCaseExample() {
        int month = 13;
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 5:
                System.out.println("may");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 12:
                System.out.print("dec");
                break;
            default:
                System.out.println("Wrong month number");
                break;
            case 2:
                System.out.println("fed");
                break;
        }
    }

    private static void ifExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter age: ");
        int age = scanner.nextInt();

        if (age < 20) {
            System.out.println("you are young");
        } else {
            System.out.println("you aten't so young");
        }

        if (age < 10) {
            System.out.println("kid");
        } else if (age < 20) {
            System.out.println("teen");
        } else if (age < 50) {
            System.out.println("adult");
        } else {
            System.out.println("old");
        }

        if (age >= 0 && age < 10) {
            System.out.println("kid");
        }
        if (age >= 10 && age < 20) {
            System.out.println("teen");
        }
        if (age >= 20 && age < 50) {
            System.out.println("adult");
        }
        if (age >= 50) {
            System.out.println("old");
        }
    }

    private static void explanation() {
        boolean condition = false;

        if (condition) System.out.println("in IF");
        System.out.println("out of IF block");

        if (condition) {
            System.out.println("in IF");
            System.out.println("still in IF block");
        } else {
            System.out.println("in ELSE block");
        }
        System.out.println("out of IF block");
    }
}
