package grasp;

public class Creator {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(26);
        Frame frame = new Frame(20);
        Bike bike = new Bike(wheel, frame);

    }
}

class Bike {
    private Wheel theWheel;
    private Frame theFrame;

    Bike(Wheel newWheel, Frame newFrame) {
        this.theWheel = newWheel;
        this.theFrame = newFrame;
    }

    // using creator method
    Bike(int wheelSize, int frameSize) {
        Wheel wheel = new Wheel(wheelSize);
        Frame frame = new Frame(frameSize);
        this.theWheel = wheel;
        this.theFrame = frame;
    }



}

class Wheel {
    private int size;

    Wheel(int newSize) {
        this.size = newSize;
    }
}

class Frame {
    private int size;

    Frame(int newSize) {
        this.size = newSize;
    }
}

