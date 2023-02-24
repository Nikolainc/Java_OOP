package Lesson_01.Class.Products.Drinks;

import Lesson_01.Class.Products.Product;
import Lesson_01.Enum.TypeProduct;

public abstract class Drinks extends Product {

    protected int volume;
    
    protected Drinks(String name, int cost, TypeProduct type, int volume) {

        super(name, cost, type);
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

            return super.equals(obj) && (this.volume == ((Drinks)obj).getVolume());
        }
        
        return false;
    }
    
    public boolean equals(String obj, int vol) {

        return super.equals(obj) && this.volume == vol;

    }
    
}
