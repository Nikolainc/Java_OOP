package Class.Products.Devices;

import Class.Products.Product;
import Enum.TypeProduct;
import Enum.Device.BrandType;
import Enum.Device.TypeDevice;

public abstract class Device extends Product{
    
    protected BrandType brand;
    protected TypeDevice typeDevice;

    protected Device(String name, TypeDevice typeDevice, BrandType brand) {

        super(brand + " " + name, TypeProduct.DEVICE);
        this.typeDevice = typeDevice;
        this.brand = brand;

    }

    @Override
    public String toString() {

        return String.format("%s\nBrand: %s\nDevice: %s", super.toString(), this.brand, this.typeDevice);

    }

    public BrandType gBrandType() {

        return this.brand;

    }

    public TypeDevice gTypeDevice() {

        return this.typeDevice;

    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof Device) {

            return super.equals(obj) && this.equals(((Device)obj).gTypeDevice(), ((Device) obj).gBrandType());

        }

        return false;

    }

    public boolean equals(TypeDevice typeDevice, BrandType brand) {

        return this.equals(typeDevice) && this.equals(brand);

    }

    public boolean equals(TypeDevice typeDevice) {

        return this.typeDevice.equals(typeDevice);

    }

    public boolean equals(BrandType brand) {

        return this.brand.equals(brand);

    }

}
