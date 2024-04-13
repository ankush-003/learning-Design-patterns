package grasp;

import java.util.ArrayList;
import java.util.List;

public class Coupling {
    public static void main(String[] args) {


        // High Coupling
        Monkey monkey = new Monkey("George");
        Lion lion = new Lion("Simba");
        // highly dependent on Monkey and Lion classes what if we want to add more animals
        ListAnimals listAnimals = new ListAnimals(monkey, lion);
        listAnimals.printAnimals();

        // Low Coupling using polymorphism
        Monkey monkey2 = new Monkey("George");
        Lion lion2 = new Lion("Simba");
        ListAnimals2 listAnimals2 = new ListAnimals2();
        listAnimals2.addAnimal(monkey2);
        listAnimals2.addAnimal(lion2);
        listAnimals2.printAnimals();
    }
}

// High Coupling due to direct dependency
class ListAnimals {
    private Monkey monkey;
    private Lion lion;

    ListAnimals(Monkey newMonkey, Lion newLion) {
        this.monkey = newMonkey;
        this.lion = newLion;
    }

    public void printAnimals() {
        System.out.println("Monkey: " + monkey);
        System.out.println("Lion: " + lion);
    }
}

class Monkey extends Animal {
    private String name;

    Monkey(String newName) {
        super(newName);
        this.name = newName;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Lion extends Animal {
    private String name;
    Lion(String newName) {
        super(newName);
        this.name = newName;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class ListAnimals2 {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
