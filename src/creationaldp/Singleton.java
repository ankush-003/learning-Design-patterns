package creationaldp;

public class Singleton {
    private static Singleton instance = null; // sometime may be accessed by multiple threads when not initialized completely
    // eager instantiation
    // private static Singleton instance = new Singleton(); // this will create the instance when the class is loaded
    private static volatile Singleton instanceThreadSafe = null; // volatile keyword ensures that multiple threads handle the instance variable correctly when it is being initialized to the Singleton instance

    private String data = "Hello";
    // we need a private constructor to prevent the creation of new instances
    private Singleton(String data) {
        this.data = data;
    }

    // this is not thread safe
    public static Singleton getInstance(String data) {
        if (instance == null) {
            instance = new Singleton(data);
        }
        return instance;
    }

    public static Singleton getInstanceThreadSafe(String data) {
        synchronized (Singleton.class) { // even if the instance was created every thread will wait for the lock on the class before creating a new instance
            if (instance == null) {
                instance = new Singleton(data);
            }
        }
        return instance;
    }

    // double check locking
    public static Singleton getInstanceThreadSafeDoubleCheckVolatile(String data) {
        if (instanceThreadSafe == null) { // limit the synchronized block to only the first time the instance is created
            synchronized (Singleton.class) {
                if (instanceThreadSafe == null) {
                    instanceThreadSafe = new Singleton(data); // use instanceThreadSafe instead of instance
                }
            }
        }
        return instanceThreadSafe;
    }

    public static Singleton getInstanceThreadSafeDoubleCheck(String data) {
        Singleton result = instance; // read the instance into a local variable to save memory access
        if (result == null) { // limit the synchronized block to only the first time the instance is created
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data); // use instanceThreadSafe instead of instance
                }
            }
        }
//        return instance;
        return result;
    }



    public String getData() {
        return this.data;
    }
}
