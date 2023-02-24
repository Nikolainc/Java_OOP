package Class.Products.Devices;

import Enum.Device.BrandType;
import Enum.Device.TypeDevice;

public class Laptop extends Device {

    protected Display display;
    protected MainMemory memory;
    protected RamMemory ramMemory;
    protected Processor processor;

    protected Laptop(String name, BrandType brand, Display display, MainMemory memory, RamMemory ramMemory, 
            Processor processor) {

        super(name, TypeDevice.LAPTOP, brand);
        this.display = display;
        this.memory = memory;
        this.ramMemory = ramMemory;
        this.processor = processor;

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
    
}
