package creationaldp;

public class AbstractFactory {
    public static void main(String[] args) {
        Manufacturer manufacturer = new AmdManufacturer();
        Gpu gpu = manufacturer.createGpu();
        Cpu cpu = manufacturer.createCpu();
        gpu.render();
        cpu.process();

        manufacturer = new IntelManufacturer();
        gpu = manufacturer.createGpu();
        cpu = manufacturer.createCpu();
        gpu.render();
        cpu.process();

    }
}

abstract class Manufacturer {
    public abstract Gpu createGpu();
    public abstract Cpu createCpu();
}

class AmdManufacturer extends Manufacturer {
    @Override
    public Gpu createGpu() {
        return new AmdGpu();
    }

    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }
}

class IntelManufacturer extends Manufacturer {
    @Override
    public Gpu createGpu() {
        return new IntelGpu();
    }

    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }
}


// Product family interfaces
interface Gpu {
    void render();
}

interface Cpu {
    void process();
}

// Product family 1
class AmdGpu implements Gpu {
    @Override
    public void render() {
        System.out.println("Rendering with AMD GPU");
    }
}

class AmdCpu implements Cpu {
    @Override
    public void process() {
        System.out.println("Processing with AMD CPU");
    }
}

// Product family 2
class IntelGpu implements Gpu {
    @Override
    public void render() {
        System.out.println("Rendering with Intel GPU");
    }
}

class IntelCpu implements Cpu {
    @Override
    public void process() {
        System.out.println("Processing with Intel CPU");
    }
}