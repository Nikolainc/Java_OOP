package Class.Requests.LaptopRequests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Devices.Laptop;
import Class.Requests.Request;
import Enum.Device.MemoryType;

public class RequestMemoryType<T extends Laptop> extends Request<T>{

    protected MemoryType mType;

    public RequestMemoryType(MemoryType mtype) {

        this.mType = mtype;

    }

    protected RequestMemoryType() {

        super();

    }

    @Override
    public List<T> filter(List<T> req) {

        return req.stream().filter(element -> element.gMainMemory().gMemoryType().equals(
                this.mType) || element.gRamMemory().gMemoryType().equals(this.mType))
                .collect(Collectors.toList());

    }
    
}
