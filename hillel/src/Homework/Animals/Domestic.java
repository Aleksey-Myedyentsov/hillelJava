package Homework.Animals;

/**
 * Created by User on 12.10.2015.
 */
public class Domestic extends AnimalNew {
    boolean isVactinated = true;
    String name;

    @Override
    public String toString() {
        return "Hello, my name is " + name + ", and I'm say " + makeSound();
    }
}
