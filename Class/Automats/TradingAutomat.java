package Class.Automats;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Product;
import Class.Requests.Request;
import Enum.TypeProduct;
import Interface.IAutomat;

public abstract class TradingAutomat<T extends Product> implements IAutomat<T> {

    protected List<T> products;

    protected TradingAutomat() {
        
        this.products = new ArrayList<T>();
        
    }

    public boolean addProduct(T product) {

        if (this.products.contains(product)) {

            return false;

        } else {

            return this.products.add(product);

        }

    }

    public List<T> getProducts() {

        return this.products;

    }

    public List<T> getProducts(String name) {

        return this.products.stream().filter(element -> element.getName().equals(name)).collect(Collectors.toList());

    }

    public List<T> getProducts(TypeProduct type) {
        
        return this.products.stream().filter(element -> element.gTypeProduct().equals(
                type)).collect(Collectors.toList());

    }

    public List<T> getProducts(Request<T> req) {

        return req.filter(this.products);

    }

}
