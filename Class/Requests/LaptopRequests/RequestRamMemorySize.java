package Class.Requests.LaptopRequests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Devices.Laptop;

public class RequestRamMemorySize<T extends Laptop> extends RequestMainMemorySize<T> {

    public RequestRamMemorySize(int size) {

        super(size);

    }

    @Override
    public List<T> filter(List<T> req) {

        return req.stream().filter(element -> element.gRamMemory().gMemorySize().getSize() >= this.size)
                .collect(Collectors.toList());

    }
    
}
