package Lesson_01.Class.Automats;

import java.util.ArrayList;
import java.util.List;

import Lesson_01.Class.Products.Product;
import Lesson_01.Interface.IAutomat;

public abstract class TradingAutomat<T extends Product> implements IAutomat<T> {

    protected List<T> products;

    protected TradingAutomat() {
        
        this.products = new ArrayList<T>();
        
    }

}
