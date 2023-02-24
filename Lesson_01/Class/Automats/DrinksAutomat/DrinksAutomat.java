package Lesson_01.Class.Automats.DrinksAutomat;

import java.util.List;

import Lesson_01.Class.Automats.TradingAutomat;
import Lesson_01.Class.Products.Drinks.Drinks;

public abstract class DrinksAutomat<T extends Drinks> extends TradingAutomat<T> {

    protected DrinksAutomat() {
        
        super();
        
    }
    
}
