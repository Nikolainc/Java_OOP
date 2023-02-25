package Class.Products.Devices;

import Enum.Device.BrandType;
import Enum.Device.MemorySize;
import Enum.Device.MemoryType;
import Enum.Device.TypeDevice;

public class MainMemory extends Memory {

    public MainMemory(String name, BrandType brand, MemorySize memory, MemoryType mtype) {

        super(name, TypeDevice.MAIN_MEMORY, brand, memory, mtype);

    }
    
}
