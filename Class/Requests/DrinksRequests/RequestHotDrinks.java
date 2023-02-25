package Class.Requests.DrinksRequests;

import java.util.List;
import java.util.stream.Collectors;

import Class.Products.Drinks.HotDrinks;

public class RequestHotDrinks<T extends HotDrinks> extends RequestDrinks<T> {

    protected int temp;

    public RequestHotDrinks(String name, int volume, int temp) {

        super(name, volume);
        this.temp = temp;

    }

    public RequestHotDrinks(int volume, int temp) {

        super(volume);
        this.temp = temp;

    }

    public RequestHotDrinks(int temp) {

        super();
        this.temp = temp;

    }

    protected RequestHotDrinks() {

        super();
        this.temp = -1;

    }

    @Override
    public List<T> filter(List<T> req) {

        if (this.temp == -1) {

            return req;

        } else {

            return super.filter(req).stream().filter(element -> element
                    .getTemp() == this.temp).collect(Collectors.toList());

        }

    }
    
}
