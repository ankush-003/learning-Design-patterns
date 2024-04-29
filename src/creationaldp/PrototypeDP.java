package creationaldp;

import java.util.HashMap;
import java.util.Map;


public class PrototypeDP {
    public static void main(String[] args) {
        PRegistry registry = new PRegistry();
        Map<String, Prototype> prototypes = registry.getPrototypes();

        Jaguar jaguar = (Jaguar) prototypes.get("Jaguar").Clone();
        System.out.println(jaguar);

        Ford ford = (Ford) prototypes.get("Ford").Clone();
        System.out.println(ford);
    }

}

interface Prototype {
    Prototype Clone();
}

class PRegistry {
    private Map<String, Prototype> prototypes = new HashMap<>();

    public PRegistry() {
        Jaguar jaguar = new Jaguar("F-Type", "Red");
        Ford ford = new Ford("Mustang", "Blue");

        prototypes.put("Jaguar", jaguar);
        prototypes.put("Ford", ford);
    }

    public Map<String, Prototype> getPrototypes() {
        return prototypes;
    }
}

class CarP implements Prototype {
    private String brand;
    private String model;
    private String color;

    public CarP(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public CarP(CarP car) {
        this.brand = car.brand;
        this.model = car.model;
        this.color = car.color;
    }

    public CarP Clone() {
        return new CarP(this);
    }
}

class Jaguar extends CarP {

    private String radio;

    public Jaguar(Jaguar car) {
        super(car);
        this.radio = car.radio;
    }
    public Jaguar(String model, String color) {
        super("Jaguar", model, color);
    }

    public Jaguar Clone() {
        return new Jaguar(this);
    }
}

class Ford extends CarP {

    private String gps;

    public Ford(Ford car) {
        super(car);
        this.gps = car.gps;
    }

    public Ford(String model, String color) {
        super("Ford", model, color);
    }

    public Ford Clone() {
        return new Ford(this);
    }
}