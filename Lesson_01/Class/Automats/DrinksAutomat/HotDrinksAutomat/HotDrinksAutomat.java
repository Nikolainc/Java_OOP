package Lesson_01.Class.Automats.DrinksAutomat.HotDrinksAutomat;

import java.util.List;

import Lesson_01.Class.Automats.DrinksAutomat.DrinksAutomat;
import Lesson_01.Class.Products.Drinks.HotDrinks;
import Lesson_01.Interface.ICoffeeAutomat;

public class HotDrinksAutomat<T extends HotDrinks> extends DrinksAutomat<T> implements ICoffeeAutomat<T>{

    public HotDrinksAutomat() {

        super();

    }

    public T getProduct(String name, int volume, int temp) {

        var reqest = new HotDrinks(name, 0, volume, temp);

        if (super.products.indexOf(reqest) != -1) {

            return super.products.get(super.products.indexOf(reqest));

        }

        return null;

    }

    @Override
    public boolean addProduct(T product) {
        
        if (super.products.contains(product)) {

            return false;

        } else {

            return super.products.add(product);

        }

    }

    @Override
    public List<T> getAllProducts() {

        return super.products;

    }

    @Override
    public T getProduct(String name) {
        
        for (T item : super.products) {

            if (item.equals(name)) {

                return item;
                
            }
            
        }
        
        return null;

    }

    
}
