package Class.Requests.DrinksRequests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Drinks.Drinks;
import Class.Requests.Request;

public class RequestDrinks<T extends Drinks> extends Request<T> {

    protected int volume;

    public RequestDrinks(String name, int volume) {

        super(name);
        this.volume = volume;

    }
    
    @Override
    public List<T> filter(List<T> req) {

        return super.filter(req).stream().filter(element -> element.getVolume() == this.volume).collect(Collectors.toList());
        
    }

}
