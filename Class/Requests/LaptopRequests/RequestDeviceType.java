package Class.Requests.LaptopRequests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Devices.Device;
import Class.Requests.Request;
import Enum.Device.TypeDevice;

public class RequestDeviceType<T extends Device> extends Request<T> {

    protected TypeDevice tDevice;

    public RequestDeviceType(TypeDevice tDevice) {

        this.tDevice = tDevice;

    }

    @Override
    public List<T> filter(List<T> req) {

        return req.stream().filter(element -> element.gTypeDevice().equals(this.tDevice))
                .collect(Collectors.toList());

    }
    
}
