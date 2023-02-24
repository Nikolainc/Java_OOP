package Class.Products.Devices;

import Enum.Device.BrandType;
import Enum.Device.MemorySize;
import Enum.Device.MemoryType;
import Enum.Device.TypeDevice;

public class RamMemory extends Device {

    protected MemorySize memory;
    protected MemoryType mtype;
    protected int frequency;

    protected RamMemory(String name, BrandType brand, MemorySize memorySize, MemoryType mtype, int frequency) {

        super(name, TypeDevice.RAM_MEMORY, brand);
        this.memory = memorySize;
        this.frequency = frequency;
        this.mtype = mtype;

    }

    public MemorySize gMemorySize() {

        return memory;

    }

    public MemoryType gMemoryType() {

        return mtype;

    }

    public int gFrequency() {

        return frequency;
        
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof RamMemory) {

            return super.equals(obj) && this.equals(((RamMemory)obj).gMemorySize(), ((RamMemory)obj).gMemoryType());

        }

        return false;

    }

    public boolean equals(MemorySize memory, MemoryType mType) {

        return this.equals(memory) && this.equals(mType);

    }

    public boolean equals(MemorySize memory) {

        return this.memory.equals(memory);

    }

    public boolean equals(MemoryType mType) {

        return this.mtype.equals(mType);

    }
    
}
