package Class.Requests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Product;
import Interface.IRequest;

public abstract class Request<T extends Product> implements IRequest<T> {

    protected String name;

    protected Request(String name) {

        this.name = name;

    }

    protected Request() {

        this("");

    }

    @Override
    public List<T> filter(List<T> req) {

        return req.stream().filter(element -> element.getName().equals(
                this.name)).collect(Collectors.toList());

    }
    
}
