package OOP;

/**
 * Created by User on 12.10.2015.
 */
public class AbstractZooExample {
    public static void main(String[] args) {
        //Animal cat = new Cat();
        //Animal dog = new Dog();

        printSound(new Cat());
        printSound(new Dog());
        Cat cat = new Cat();
        Dog dog = new Dog();
        vaccinate(cat);
        vaccinate(dog);

        Employee employee = new Employee();

        vaccinate(employee);


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(employee);

        Employee employee1 = new Employee();
        Human human = employee;
        Object object = human;
        Vaccinable vaccinable = employee1;

        //human = new Human(); //Exception (douncast)
        employee1 = (Employee) human; // upcast
        employee1.vaccinate("asdf");
    }

    public static void vaccinate(Vaccinable animalOrEmployee) {
        animalOrEmployee.vaccinate("ASD-1");
    }

    public static void printSound(Animal animal) {
        System.out.println(animal.makeSound());
    }
}
