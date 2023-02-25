package Class.Products.Drinks;

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
        
        return String.format("%s\nVolume: %s ml", super.toString(), volume);
        
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Drinks) {

            return super.equals(obj) && this.volume == ((Drinks)obj).getVolume();
            
        }
        
        return false;
    }

    public boolean equals(int volume) {
        
        return this.volume == volume;

    }
    
}
