package Class.Automats.DrinksAutomat.HotDrinksAutomat;

import java.util.List;

import Class.Automats.DrinksAutomat.DrinksAutomat;
import Class.Products.Drinks.HotDrinks;
import Class.Requests.Request;

public class HotDrinksAutomat<T extends HotDrinks> extends DrinksAutomat<T>{

    public HotDrinksAutomat() {

        super();

    }

    @Override
    public List<T> getProducts(Request<T> req) {
        
        return req.filter(super.products);

    }
    
}
