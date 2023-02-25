package Class.Products.Devices;

import Enum.Device.BrandType;
import Enum.Device.TypeDevice;
import Enum.Device.TypeOS;

public class Laptop extends Device {

    protected Display display;
    protected MainMemory memory;
    protected RamMemory ramMemory;
    protected Processor processor;
    protected TypeOS operationSystem;

    public Laptop(String name, BrandType brand, Display display, MainMemory memory, RamMemory ramMemory, 
            Processor processor, TypeOS operationSystem) {

        super(name, TypeDevice.LAPTOP, brand);
        this.display = display;
        this.memory = memory;
        this.ramMemory = ramMemory;
        this.processor = processor;
        this.operationSystem = operationSystem;

    }

    @Override
    public String toString() {

        return String.format("%s\nDisplay: %s\nMemory: %s\nRAM: %s\nProcessor: %s\nOS: %s", super.toString(), this.display, this.memory, this.ramMemory, this.processor, this.operationSystem);

    }

    public Display gDisplay() {

        return this.display;

    }

    public MainMemory gMainMemory() {

        return this.memory;

    }

    public RamMemory gRamMemory() {

        return this.ramMemory;

    }

    public Processor gProcessor() {

        return this.processor;

    }

    public TypeOS gTypeOS() {

        return this.operationSystem;

    }
    
}
