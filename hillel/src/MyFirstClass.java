/**
 * Created by User on 21.09.2015.
 */
public class MyFirstClass {
    public static void main(String args[]) {
        sayHallo();
        int age = 30;
        ageMethode(age);

    }

    private static void ageMethode(int age) {
        System.out.println(age);
        age = 50;
    }

    private static void ageMethode() {
        //String helloMessage = "Hello World";
        //System.out.println(helloMessage);
        final int maxAge = 1984;
        int age = calculateAge(maxAge);
        System.out.println("age is: " + age);

        int alexAge = calculateAge(1981);
        System.out.println("Alex age is:" + alexAge);
    }

    public static void sayHallo() {
        String helloMessage = "hello World";
        System.out.println(helloMessage);
    }

    public static int calculateAge() {
        final int birthYear = 1983;

        int year = 2015;
        int age = year - birthYear;
        return age;
    }

    public static int calculateAge(int birthYear) {
        int year = 2015;
        int age = year - birthYear;
        return age;
    }
}
