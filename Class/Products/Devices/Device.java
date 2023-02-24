package Class.Products.Devices;

import Class.Products.Product;
import Enum.TypeProduct;
import Enum.Device.TypeDevice;

public abstract class Device extends Product{
    
    protected TypeDevice typeDevice;

    protected Device(String name, int cost, TypeDevice typeDevice) {

        super(name, cost, TypeProduct.DEVICE);
        this.typeDevice = typeDevice;

    }

    public TypeDevice gTypeDevice() {

        return this.typeDevice;

    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof Device) {

            return super.equals(obj) && this.equals(((Device)obj).gTypeDevice());

        }

        return false;

    }

    public boolean equals(TypeDevice typeDevice) {

        return this.typeDevice.equals(typeDevice);

    }

    
}
