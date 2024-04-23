package creationaldp;

public class SimpleFactory {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Burger burger = restaurant.orderBurger("cheeseburger");
        burger.cook();
        burger.box();
    }
}

class Restaurant {
    public Burger orderBurger(String type) {
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger burger = factory.createBurger(type);
        burger.prepare();
        return burger;
    }
}

interface Burger {
    void prepare();
    void cook();
    void box();
}


// this is the factory class
// it still is open for modification since we use if else to create the object
class SimpleBurgerFactory {
    public Burger createBurger(String type) {
        Burger burger = null;
        if (type.equals("cheeseburger")) {
            burger = new CheeseBurger();
        } else if (type.equals("chickenburger")) {
            burger = new ChickenBurger();
        } else if (type.equals("veggieburger")) {
            burger = new VeggieBurger();
        }
        return burger;
    }
}

class CheeseBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Burger");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Cheese Burger");
    }

    @Override
    public void box() {
        System.out.println("Boxing Cheese Burger");
    }
}

class ChickenBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Burger");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Chicken Burger");
    }

    @Override
    public void box() {
        System.out.println("Boxing Chicken Burger");
    }
}

class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Burger");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Veggie Burger");
    }

    @Override
    public void box() {
        System.out.println("Boxing Veggie Burger");
    }
}

