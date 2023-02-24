package Interface;

import Enum.Device.BrandType;
import Enum.Device.MemorySize;

public interface ILaptopAutomat<T> extends IAutomat<T>{

    public T getProduct(String name, BrandType brand, MemorySize size, MemorySize ram);
    
}
