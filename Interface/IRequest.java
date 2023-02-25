package Interface;

import java.util.List;

import Class.Products.Product;

public interface IRequest<T extends Product> {

    public List<T> filter(List<T> req);
    
}
