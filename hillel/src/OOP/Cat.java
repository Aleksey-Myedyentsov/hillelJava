package OOP;

/**
 * Created by User on 05.10.2015.
 */
public class Cat extends Animal implements Comparable<Cat> {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    //public String someField = "Cat's Field"
    boolean pet;
    String color;

    public Cat() {
        super("unknown", 0);
        System.out.println("int cat's constructor");
    }


    public Cat(boolean isPet, int age, String name, String color) {
        super(name, age);
        this.pet = isPet;
        this.color = color;
    }

    public static String getTypeName() {
        return "Cat";
    }

    @Override
    public boolean equals(Object otherOject) {
        System.out.println("in cat's equals method");

        if (!super.equals(otherOject)) return false;

        if (!(otherOject instanceof Cat)) return false;

        Cat otherCat = (Cat) otherOject;

        if (pet != otherCat.pet) return false;
        if (!color.equals(otherCat.color)) return false;
        return false;
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Cat{" +
                "pet=" + pet +
                ", color='" + color + '\'' +
                '}';
        return result;
    }

    public String getSomeField() {
        return someField;
    }

    @Override
    public int compareTo(Cat o) {
        return this.getName().compareTo(o.getName());
    }
}
