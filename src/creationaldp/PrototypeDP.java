package creationaldp;

public class PrototypeDP {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 1000000, 4);
        Car car2 = car1.clone();
        System.out.println("Car 1: " + car1.getModel() + " " + car1.getPrice() + " " + car1.getDoors());
        System.out.println("Car 2: " + car2.getModel() + " " + car2.getPrice() + " " + car2.getDoors());
    }
}

interface Prototype {
    Vehicle clone();
}

class Vehicle implements Prototype {
    private String model;
    private int price;

    public Vehicle(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public Vehicle(Vehicle v) {
        this.model = v.model;
        this.price = v.price;
    }

    public Vehicle clone() {
        return new Vehicle(this);
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String model, int price, int doors) {
        super(model, price);
        this.doors = doors;
    }

    public Car(Car c) {
        super(c);
        this.doors = c.doors;
    }

    public Car clone() {
        return new Car(this);
    }

    public int getDoors() {
        return doors;
    }
}


