package grasp;

public class Polymorphism {
}

abstract class GetSilverPrice {
    abstract void getPrice();

    public String getName(){
        return "Silver";
    }
}

class GetGoldPrice extends GetSilverPrice {
    @Override
    void getPrice() {
        System.out.println("Gold price is $1000");
    }

    @Override
    public String getName() {
        return "Gold";
    }
}