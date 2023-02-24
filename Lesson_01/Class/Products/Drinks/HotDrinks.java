package Lesson_01.Class.Products.Drinks;

import Lesson_01.Enum.TypeProduct;

public class HotDrinks extends Drinks {

    protected int temp;

    public HotDrinks(String name, int cost, int volume, int temp) {

        super(name, cost, TypeProduct.COFFEE, volume);
        this.temp = temp;

    }

    public int getTemp() {

        return this.temp;

    }

    @Override
    public String toString() {

        return String.format("%s\nTemperture: %s C", super.toString(), temp);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof HotDrinks) {

            return super.equals(obj) && (this.temp == ((HotDrinks) obj).getTemp());

        }
        
        return false;

    }

    public boolean equals(String obj, int vol, int temp) {

        return super.equals(obj, vol) && this.temp == temp;

    }
    
}