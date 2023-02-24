package Class.Automats.DrinksAutomat;

import Class.Automats.TradingAutomat;
import Class.Products.Drinks.Drinks;

public abstract class DrinksAutomat<T extends Drinks> extends TradingAutomat<T> {

    protected DrinksAutomat() {
        
        super();
        
    }
    
}
