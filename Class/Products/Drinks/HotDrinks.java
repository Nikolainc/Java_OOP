package Class.Products.Drinks;

import Enum.TypeProduct;

public class HotDrinks extends Drinks {

    protected int temp;

    public HotDrinks(String name, int volume, int temp) {

        super(name, TypeProduct.COFFEE, volume);
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

            return super.equals(obj) && this.equals(((HotDrinks) obj).getTemp());

        }
        
        return false;

    }

    public boolean equals(String obj, int vol, int temp) {

        return super.equals(obj, vol) && this.equals(temp);

    }

    @Override
    public boolean equals(int temp) {

        return this.temp == temp;

    }
    
}