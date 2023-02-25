package Class.Requests.LaptopRequests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Devices.Laptop;
import Class.Requests.Request;

public class RequestDisplayInch<T extends Laptop> extends Request<T> {

    protected int inch;

    public RequestDisplayInch(int inch) {

        this.inch = inch;

    }

    @Override
    public List<T> filter(List<T> req) {

        return req.stream().filter(element -> element.gDisplay().gDiagonal() == this.inch)
                .collect(Collectors.toList());

    }
    
}