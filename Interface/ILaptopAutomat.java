package Interface;

import java.util.List;

import Class.Products.Devices.Laptop;
import Class.Requests.Request;

public interface ILaptopAutomat<T extends Laptop> extends IAutomat<T>{

    public List<T> getProducts(Request<T> req);
    
}
