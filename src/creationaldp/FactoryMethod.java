package creationaldp;

public class FactoryMethod {
    public static void main(String[] args) {
        GoodRestaurant restaurant = new CheeseBurgerRestaurant();
        restaurant.takeOrder();
    }
}

abstract class GoodRestaurant {
    public void takeOrder() {
        Burger burger = createBurger();
        burger.prepare();
        burger.cook();
        burger.box();
    }

    protected abstract Burger createBurger();
}

class CheeseBurgerRestaurant extends GoodRestaurant {
    @Override
    protected Burger createBurger() {
        return new CheeseBurger();
    }
}

class ChickenBurgerRestaurant extends GoodRestaurant {
    @Override
    protected Burger createBurger() {
        return new ChickenBurger();
    }
}

class VeggieBurgerRestaurant extends GoodRestaurant {
    @Override
    protected Burger createBurger() {
        return new VeggieBurger();
    }
}
