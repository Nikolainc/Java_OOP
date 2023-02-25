package Class.Requests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Product;
import Interface.IRequest;

public class Request<T extends Product> implements IRequest<T> {

    protected String name;

    public Request(String name) {

        this.name = name;

    }

    protected Request() {

        this("");

    }

    @Override
    public List<T> filter(List<T> req) {

        if (this.name.equals("")) {

            return req;

        } else {

            return req.stream().filter(element -> element.getName().equals(
                    this.name)).collect(Collectors.toList());

        }

    }
    
}
