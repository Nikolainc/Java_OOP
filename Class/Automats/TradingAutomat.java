package Class.Automats;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import Class.Products.Product;
import Enum.TypeProduct;
import Interface.IAutomat;
import Interface.IRequest;

public abstract class TradingAutomat<T extends Product> implements IAutomat<T>, Iterable<T> {

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

    public List<T> getProducts(IRequest<T> req) {

        return req.filter(this.products);

    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            private int index = 0;

            @Override
            public boolean hasNext() {

                return index < products.size();

            }

            @Override
            public T next() {

                if (index >= products.size()) {

                    throw new NoSuchElementException();
                    
                }
                
                return products.get(index++);

            }

        };

    }

}
