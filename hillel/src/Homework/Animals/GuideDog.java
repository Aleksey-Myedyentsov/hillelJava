package Homework.Animals;

/**
 * Created by User on 12.10.2015.
 */
public class GuideDog extends Domestic {
    boolean isTrained = true;

    public GuideDog(int id, String name, int age, double weight, String color, boolean isVactinated, boolean isTrained) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isVactinated = isVactinated;
        this.isTrained = isTrained;

    }

    @Override
    public String makeSound() {
        if (GuideDog.this.isTrained) {
            return "I can take you home.";
        } else {
            return "I can't take you home, because I did not trained(.";
        }
    }
}
