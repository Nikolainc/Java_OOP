package Class.Requests.LaptopRequests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Devices.Laptop;
import Class.Requests.Request;

public class RequestMainMemorySize<T extends Laptop> extends Request<T> {

    protected int size;

    public RequestMainMemorySize(int size) {

        super();
        this.size = size;

    }
    
    @Override
    public List<T> filter(List<T> req) {

        return req.stream().filter(element -> element.gMainMemory().gMemorySize().getSize() > this.size).collect(Collectors.toList());

    }
    
}
