import java.util.Scanner;

/**
 * Created by User on 01.10.2015.
 */
public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("for loop " + i);
        }

    }

    private static void doWhileMethode() {
        Scanner scanner = new Scanner(System.in);
        String yesNo;
        do {
            System.out.println("yes/no");
            yesNo = scanner.next();
        } while (!(yesNo.equals("yes") || yesNo.equals("no")));
    }

    private static void whileMethod() {
        int money = 1000;
        int month = 0;

        while (money < 1500) {
            money += 100;
            month++;
        }
        System.out.println("Money: " + money + ", month: " + month);
    }
}
