package Class.Products.Devices;

import java.util.Objects;

import Enum.Device.BrandType;
import Enum.Device.TypeDevice;

public class Processor extends Device{

    protected float frequency;

    public Processor(String name, BrandType brand, float frequency) {

        super(name, TypeDevice.PROCESSOR, brand);
        this.frequency = frequency;

    }

    @Override
    public String toString() {

        return String.format("%s %s GHz", this.name, this.frequency);

    }

    public float gFrequency() {

        return this.frequency;

    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj != null && obj.getClass() == this.getClass()) {

            return super.equals(obj) && this.equals(((Processor)obj).gFrequency());

        }

        return false;

    }

    public boolean equals(float freq) {

        return this.frequency == freq;

    }

    @Override
    public int hashCode() {

        return super.hashCode() * Objects.hash(this.frequency);

    }

}
