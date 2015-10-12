package Homework.Animals;

/**
 * Created by User on 12.10.2015.
 */
public class Wild extends AnimalNew {
    boolean isPredator = true;

    @Override
    public String makeSound() {
        if (Wild.this.isPredator) {
            return "and I am angry";
        } else {
            return "I am a wild animal";
        }
    }

    @Override
    public String toString() {
        return "Hello, " + makeSound();
    }
}
