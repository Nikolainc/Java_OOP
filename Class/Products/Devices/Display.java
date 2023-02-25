package Class.Products.Devices;

import Enum.Device.BrandType;
import Enum.Device.TypeDevice;

public class Display extends Device {

    protected int diagonal;

    public Display(String name, BrandType brand, int diagonal) {

        super(name, TypeDevice.DISPLAY, brand);
        this.diagonal = diagonal;
        
    }

    @Override
    public String toString() {
        
        return String.format("%s inch", this.diagonal);

    }

    public int gDiagonal() {

        return this.diagonal;

    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj instanceof Display) {

            return super.equals(obj) && this.equals(((Display)obj).gDiagonal());

        }

        return false;

    }

    public boolean equals(int diagonal) {

        return this.diagonal == diagonal;

    }
    
}
