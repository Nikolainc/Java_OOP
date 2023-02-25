package Class.Automats.DrinksAutomat.HotDrinksAutomat;

import java.util.List;

import Class.Automats.DrinksAutomat.DrinksAutomat;
import Class.Products.Drinks.HotDrinks;
import Interface.IRequest;

public class HotDrinksAutomat<T extends HotDrinks> extends DrinksAutomat<T> {

    public HotDrinksAutomat() {

        super();

    }

    @Override
    public List<T> getProducts(IRequest<T> req) {
        
        return req.filter(super.products);

    }
    
}
