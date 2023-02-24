package Class.Products.Devices;

import Enum.Device.BrandType;
import Enum.Device.MemorySize;
import Enum.Device.MemoryType;
import Enum.Device.TypeDevice;

public class MainMemory extends Device {

    protected MemorySize memory;
    protected MemoryType mtype;

    protected MainMemory(String name, BrandType brand, MemorySize memory, MemoryType mtype) {

        super(name, TypeDevice.MAIN_MEMORY, brand);
        this.memory = memory;
        this.mtype = mtype;

    }

    public MemorySize gMemorySize() {

        return this.memory;

    }

    public MemoryType gMemoryType() {

        return this.mtype;

    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof MainMemory) {

            return super.equals(obj) && this.equals(((MainMemory)obj).gMemorySize(), ((MainMemory) obj).gMemoryType());

        }

        return false;

    }

    public boolean equals(MemorySize memory, MemoryType mtype) {

        return this.equals(memory) && this.equals(mtype);

    }

    public boolean equals(MemorySize memory) {

        return this.memory.equals(memory);

    }
    
    public boolean equals(MemoryType mtype) {

        return this.mtype.equals(mtype);

    }
    
}
