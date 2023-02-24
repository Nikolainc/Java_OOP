package Lesson_01.Interface;

import java.util.List;

public interface IAutomat<T> {
    
    public T getProduct(String name);

    public boolean addProduct(T product);

    public List<T> getAllProducts();

}
