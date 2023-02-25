package Class.Products.Devices;

import Enum.Device.BrandType;
import Enum.Device.MemorySize;
import Enum.Device.MemoryType;
import Enum.Device.TypeDevice;

public abstract class Memory extends Device {

    protected MemorySize msize;
    protected MemoryType mtype;

    protected Memory(String name, TypeDevice typeDevice, BrandType brand, MemorySize memory, MemoryType mtype) {

        super(name, typeDevice, brand);
        this.msize = memory;
        this.mtype = mtype;

    }

    @Override
    public String toString() {

        return String.format("%s - %s %s MB", this.name, this.mtype, this.msize.getSize());

    }

    public MemorySize gMemorySize() {

        return this.msize;

    }

    public MemoryType gMemoryType() {

        return this.mtype;

    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Memory) {

            return super.equals(obj) && this.equals(((Memory) obj).gMemorySize(), ((Memory) obj).gMemoryType());

        }

        return false;

    }

    public boolean equals(MemorySize memory, MemoryType mtype) {

        return this.equals(memory) && this.equals(mtype);

    }

    public boolean equals(MemorySize memory) {

        return this.msize.equals(memory);

    }

    public boolean equals(MemoryType mtype) {

        return this.mtype.equals(mtype);

    }
    
}
