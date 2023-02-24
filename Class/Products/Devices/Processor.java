package Class.Products.Devices;

import Enum.Device.BrandType;
import Enum.Device.TypeDevice;

public class Processor extends Device{

    protected int frequency;

    protected Processor(String name, BrandType brand, int frequency) {

        super(name, TypeDevice.PROCESSOR, brand);
        this.frequency = frequency;

    }

    public int gFrequency() {

        return this.frequency;

    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof Processor) {

            return super.equals(obj) && this.equals(((Processor)obj).gFrequency());

        }

        return false;

    }

    public boolean equals(int freq) {

        return this.frequency == freq;

    }

}
