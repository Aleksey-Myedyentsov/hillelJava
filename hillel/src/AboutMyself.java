import java.util.*;

public class AboutMyself {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        char space = ' ';

        System.out.println ("Enter Your FirsName: ");
        String firstName = scanner.nextLine();
        firstName = firstName.replace(" ", "");

        System.out.println ("Enter Your LastName: ");
        String lastName = scanner.nextLine();
        lastName = lastName.replace(" ", "");

        System.out.println ("Please Enter Your Birth Year: ");
        int dob = scanner.nextInt();

        System.out.println ("Please Enter Your Birth Year: ");
        int currentDate = scanner.nextInt();

        System.out.println ("Your Name Is: " + firstName + " " + lastName);
        System.out.println ("Your Name Is: " + firstName + space + lastName);
        System.out.println ("And Your age Is: " + (currentDate - dob));
    }
}