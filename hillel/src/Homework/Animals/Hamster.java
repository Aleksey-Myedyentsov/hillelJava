package Homework.Animals;

/**
 * Created by User on 12.10.2015.
 */
public class Hamster extends Domestic {
    public Hamster(int id, String name, int age, double weight, String color, boolean isVactinated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isVactinated = isVactinated;
    }

    @Override
    public String makeSound() {
        return "Piu, piu, piu... ";
    }
}
