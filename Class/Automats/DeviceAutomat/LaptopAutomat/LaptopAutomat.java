package Class.Automats.DeviceAutomat.LaptopAutomat;

import java.util.List;

import Class.Automats.DeviceAutomat.DeviceAutomat;
import Class.Products.Devices.Laptop;
import Enum.Device.BrandType;
import Enum.Device.MemorySize;
import Interface.ILaptopAutomat;

public class LaptopAutomat<T extends Laptop> extends DeviceAutomat<T> implements ILaptopAutomat<T>{

    @Override
    public T getProduct(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
    }

    @Override
    public boolean addProduct(T product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addProduct'");
    }

    @Override
    public List<T> getAllProducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

    @Override
    public T getProduct(String name, BrandType brand, MemorySize size, MemorySize ram) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
    }
    
}
