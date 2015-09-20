import java.util.*;
/**
 * Created by User on 20.09.2015.
 */
public class AboutMyself {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        String firstName, lastName;
        int dob, currentDate;

        System.out.println ("Enter Your FirsName: ");
        firstName = scanner.nextLine();
        firstName = firstName.replace(" ", "");

        System.out.println ("Enter Your LastName: ");
        lastName = scanner.nextLine();
        lastName = lastName.replace(" ", "");

        System.out.println ("Please Enter Your Birth Year: ");
        dob = scanner.nextInt();

        System.out.println ("Please Enter Your Birth Year: ");
        currentDate = scanner.nextInt();

        System.out.println ("Your Name Is: " + firstName + " " + lastName);
        System.out.println ("And Your age Is: " + (currentDate - dob));




    }
}
