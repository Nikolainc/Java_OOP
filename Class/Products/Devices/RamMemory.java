package Class.Products.Devices;

import Enum.Device.BrandType;
import Enum.Device.MemorySize;
import Enum.Device.MemoryType;
import Enum.Device.TypeDevice;

public class RamMemory extends Memory {

    protected int frequency;

    public RamMemory(String name, BrandType brand, MemorySize memorySize, int frequency) {

        super(name, TypeDevice.RAM_MEMORY, brand, memorySize, MemoryType.DDR4);
        this.frequency = frequency;

    }

    @Override
    public String toString() {

        return String.format("%s %s MHz", super.toString(), this.frequency);

    }

    public int gFrequency() {

        return this.frequency;
        
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof RamMemory) {

            return super.equals(obj) && this.equals(((RamMemory)obj).gFrequency());

        }

        return false;

    }

    public boolean equals(int freq) {

        return this.frequency == freq;

    }
    
}
