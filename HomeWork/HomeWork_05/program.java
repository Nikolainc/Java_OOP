package HomeWork.HomeWork_05;
import Class.Fabrics.LaptopFabric;
import Class.Products.Devices.Laptop;
import Class.Singleton.*;
import Enum.Device.BrandType;

public class program {

    public static void main(String[] args) {

        SLaptopAutomat<Laptop> automatSingleton = SLaptopAutomat.getInstanse();
        LaptopFabric.addLaptop(automatSingleton, BrandType.ACER ,5);
        LaptopFabric.addLaptop(automatSingleton, BrandType.SAMSUNG, 5);
        LaptopFabric.addLaptop(automatSingleton, BrandType.APPLE, 5);
        System.out.println(automatSingleton.getProducts());
        
    }
    
}
