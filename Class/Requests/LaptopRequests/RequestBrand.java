package Class.Requests.LaptopRequests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Devices.Device;
import Class.Requests.Request;
import Enum.Device.BrandType;

public class RequestBrand<T extends Device> extends Request<T> {

    protected BrandType brand;

    public RequestBrand(BrandType brand) {

        this.brand = brand;

    }

    @Override
    public List<T> filter(List<T> req) {

        return req.stream().filter(element -> element.gBrandType().equals(this.brand))
                .collect(Collectors.toList());

    }
    
}
