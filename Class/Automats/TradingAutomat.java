package Class.Automats;

import java.util.ArrayList;
import java.util.List;

import Class.Products.Product;
import Interface.IAutomat;

public abstract class TradingAutomat<T extends Product> implements IAutomat<T> {

    protected List<T> products;

    protected TradingAutomat() {
        
        this.products = new ArrayList<T>();
        
    }

}
