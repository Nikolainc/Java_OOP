package Class.Singleton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import Class.Products.Devices.Laptop;
import Enum.TypeProduct;
import Interface.IAutomat;
import Interface.IRequest;

//Double Checked Locking

public class SLaptopAutomat<T extends Laptop> implements IAutomat<T>, Iterable<T> {

    private static SLaptopAutomat<Laptop> INSTANCE;

    protected List<T> products;

    private SLaptopAutomat() {

        this.products = new ArrayList<>();

    }

    public static SLaptopAutomat<Laptop> getInstanse() {

        if (INSTANCE == null) {

            synchronized(SLaptopAutomat.class) {

                if (INSTANCE == null) {

                    return new SLaptopAutomat<Laptop>();

                }

            }

        }

        return INSTANCE;

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
