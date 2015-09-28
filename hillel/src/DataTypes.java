/**
 * Created by User on 21.09.2015.
 */
public class DataTypes {
    public static void main(String[] args) {
        int age = 31;

        int days = age * 365;

        int hours = days * 24;

        int seconds = hours * 3600;

        long milliseconds = seconds * 1000L;

        long longSeconds = milliseconds / 1000;
        seconds = (int) longSeconds;

        seconds = (int) (milliseconds / 1000);
        seconds = (int) milliseconds / 1000; //not correct (milliseconds to int /1000)

        double d = 3.54;
        int i = 10;
        long l = 100;
        float f = 2.5F;

        System.out.println(milliseconds);

    }
}
