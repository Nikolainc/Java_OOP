package Interface;

import java.util.List;

import Class.Products.Drinks.HotDrinks;
import Class.Requests.Request;

public interface ICoffeeAutomat<T extends HotDrinks> extends IAutomat<T> {

    public List<T> getProducts(Request<T> req);
    
}
