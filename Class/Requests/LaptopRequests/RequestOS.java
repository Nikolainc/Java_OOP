package Class.Requests.LaptopRequests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Devices.Laptop;
import Class.Requests.Request;
import Enum.Device.TypeOS;

public class RequestOS<T extends Laptop> extends Request<T> {

    protected TypeOS typeOS;

    public RequestOS(TypeOS typeOS) {

        this.typeOS = typeOS;

    }

    @Override
    public List<T> filter(List<T> req) {

        return req.stream().filter(element -> element.gTypeOS().equals(this.typeOS))
                .collect(Collectors.toList());

    }
    
}
