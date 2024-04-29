package behaviouraldp;

import java.util.List;

public class CommandPattern {
    public static void main(String[] args) {
        List<BadRoom> badHouse = List.of(new BadRoom(new Light()), new Bathroom(new Light()));

        // command pattern
        Light light = new Light();
        Room room = new Room();

        room.setCommand(new SwitchLightsCommand(light));
        room.executeCommand();
    }
}

class Light {
    private boolean on;
    public boolean isOn() {
        return on;
    }
    public boolean getSwitch() {
        return on;
    }
    public void setSwitch(boolean on) {
        this.on = on;
    }
}

// this is a bad design, it also violates the single responsibility principle, there are many subclasses which may break if the base class changes
class BadRoom {
    private Light light;
    public BadRoom(Light light) {
        this.light = light;
    }
    public void switchOn() {
        light.setSwitch(true);
    }
    public void switchOff() {
        light.setSwitch(false);
    }
}

// enormous baseclasses, may break if
class Bathroom extends BadRoom {
    private String Geyser;

    public Bathroom(Light light) {
        super(light);
    }

    public void switchOn() {
        super.switchOn();
        System.out.println("Geyser switched on!");
    }
}

// using command pattern
interface Command {
    void execute();
}

class SwitchLightsCommand implements Command {
    private Light light;
    public SwitchLightsCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        System.out.println("Switching lights");
        light.setSwitch(!light.isOn());
        System.out.println("Lights are now " + (light.isOn() ? "on" : "off"));
    }
}

class Room {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}

