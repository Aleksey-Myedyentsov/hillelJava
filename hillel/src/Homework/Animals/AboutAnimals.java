package Homework.Animals;

/**
 * Created by User on 12.10.2015.
 */
public class AboutAnimals {
    public static void main(String[] args) {
        int i = 0;

        Cat tomCat = new Cat(i++, "Tom", 3, 5.5, "gray", true);
        System.out.println("id: " + i);
        System.out.println(tomCat);

        Dog belkaDog = new Dog(i++, "Belka", 5, 10.8, "Red", true);
        System.out.println("id: " + i);
        System.out.println(belkaDog);

        Hamster homkaHamster = new Hamster(i++, "Homka", 1, 0.320, "white", false);
        System.out.println("id: " + i);
        System.out.println(homkaHamster);

        Lion lion = new Lion(i++, 10, 80.900, "Brown", true);
        System.out.println("id: " + i);
        System.out.println(lion);

        Giraffe giraffe = new Giraffe(i++, 15, 120.20, "Yello", false);
        System.out.println("id: " + i);
        System.out.println(giraffe);

        GuideDog guideDog1 = new GuideDog(i++, "Chappie", 4, 10.500, "Black", true, true);
        System.out.println("id: " + i);
        System.out.println(guideDog1);

        GuideDog guideDog2 = new GuideDog(i++, "Kashtanka", 1, 6.300, "Rad", true, false);
        System.out.println("id: " + i);
        System.out.println(guideDog2);

        Fish fish = new Fish(i++, "Goldie", 1, 0.50, "Gold", false);
        System.out.println("id: " + i);
        System.out.println(fish);

        Wolf wolf = new Wolf(i++, 8, 40.200, "Gray", true);
        System.out.println("id: " + i);
        System.out.println(wolf);

        Crocodile crocodile = new Crocodile(i++, 3, 50.2, "Grren", true);
        System.out.println("id: " + i);
        System.out.println(crocodile);

    }

}
