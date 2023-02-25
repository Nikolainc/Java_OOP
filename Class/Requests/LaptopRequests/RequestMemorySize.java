package Class.Requests.LaptopRequests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Devices.Laptop;
import Enum.Device.MemoryType;

public class RequestMemorySize<T extends Laptop> extends RequestMemoryType<T> {

    protected int size;

    public RequestMemorySize(MemoryType mtype, int minSize) {

        super(mtype);
        this.size = minSize;

    }
    
    @Override
    public List<T> filter(List<T> req) {
        
        return super.filter(req).stream().filter(element -> element.gMainMemory().gMemorySize().getSize() >= this.size || element
                .gRamMemory().gMemorySize().getSize() >= this.size).collect(Collectors.toList());

    }
    
}
