package HomeWork.HomeWork_04;

import Class.Automats.TradingAutomat;
import Class.Products.Devices.Laptop;

public class program {

    public static void main(String[] args) {
        
        TradingAutomat<Laptop> automat = new TradingAutomat<>();

        automat.addProduct(new Laptop(null, null, null, null, null, null, null));

    }
    
}
