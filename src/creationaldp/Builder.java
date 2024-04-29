package creationaldp;

public class Builder {
    public static void main(String[] args) {
        CarBase car = new CarBuilder()
                .setId(1)
                .setBrand("Toyota")
                .setModel("Corolla")
                .setColor("Black")
                .build();

        System.out.println(car);

        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        CarBase bugatti = builder.build();
    }
}

class CarBase {
    private final int id;
    private final String brand;
    private final String model;
    private final String color;

    // package private constructor as builder is in the same package
    CarBase(int id, String brand, String model, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

class CarBuilder {
    private int id;
    private String brand;
    private String model;
    private String color;

    public CarBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBase build() {
        return new CarBase(id, brand, model, color);
    }
}


// Director is used if we want to build the object in a specific way

class Director {
    public void buildBugatti(CarBuilder builder) {
        builder.setId(1)
                .setBrand("Bugatti")
                .setModel("Veyron")
                .setColor("Blue");
    }

    public void buildFerrari(CarBuilder builder) {
        builder.setId(2)
                .setBrand("Ferrari")
                .setModel("F8 Tributo")
                .setColor("Red");
    }
}