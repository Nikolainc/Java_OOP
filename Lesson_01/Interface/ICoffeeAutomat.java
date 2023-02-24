package Lesson_01.Interface;

public interface ICoffeeAutomat<T> extends IAutomat<T>{

    public T getProduct(String name, int volume, int temp);
    
}
