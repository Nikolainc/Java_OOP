package Interface;

import java.util.List;

import Class.Products.Product;
import Class.Requests.Request;
import Enum.TypeProduct;

public interface IAutomat<T extends Product> {
    
    public List<T> getProducts(String name);

    public List<T> getProducts(TypeProduct type);

    public List<T> getProducts(Request<T> name);

    public boolean addProduct(T product);

    public List<T> getProducts();

}
