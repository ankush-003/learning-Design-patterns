package solid;

public class DIP {
    public static void main(String[] args) {
        GoodComputer goodComputer = new GoodComputer(new StandardKeyboard2());
        goodComputer.type();
    }
}

// BadComputer class is dependent on StandardKeyboard class, violating Dependency Inversion Principle
// as High-level modules should not depend on low-level modules. Both should depend on abstractions.
class BadComputer {
    private final StandardKeyboard keyboard = new StandardKeyboard();
    public void type() {
        keyboard.type();
    }
}

class StandardKeyboard {
    public void type() {
        // Type using standard keyboard
    }
}

// Using abstraction to avoid violating Dependency Inversion Principle
interface Keyboard {
    void type();
}

class GoodComputer {
    private final Keyboard keyboard;
    public GoodComputer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    public void type() {
        keyboard.type();
    }
}

class StandardKeyboard2 implements Keyboard {
    public void type() {
        // Type using standard keyboard
    }
}
