package Class.Products.Drinks;

import java.util.Objects;

import Class.Products.Product;
import Enum.TypeProduct;

public class Drinks extends Product {

    protected int volume;
    
    protected Drinks(String name, TypeProduct type, int volume) {

        super(name, type);
        this.volume = volume;

    }

    public int getVolume() {

        return this.volume;

    }

    @Override
    public String toString() {
        
        return String.format("%s, Volume: %s ml", super.toString(), volume);
        
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj.getClass() == this.getClass()) {

            return super.equals(obj) && this.volume == ((Drinks)obj).getVolume();
            
        }
        
        return false;
    }

    public boolean equals(int volume) {
        
        return this.volume == volume;

    }

    @Override
    public int hashCode() {

        return super.hashCode() * Objects.hash(this.volume);

    }
    
}
