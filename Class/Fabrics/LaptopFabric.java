package Class.Fabrics;

import java.util.Random;

import Class.Products.Devices.*;
import Class.Singleton.SLaptopAutomat;
import Enum.Device.*;

public class LaptopFabric {

    private static Random rand = new Random();

    private static BrandType brandType;
    
    public static void addLaptop(SLaptopAutomat<Laptop> automat, BrandType brand, int count) {

        brandType = brand;

        while (count > 0) {

            addLaptop(automat);
            count--;
            
        }

    }

    private static void addLaptop(SLaptopAutomat<Laptop> automat) {

        String name = rand.nextInt(1000) + " NOTEBOOK";
        Display displ = getDisplay();
        MainMemory memory = getMemory();
        RamMemory ramMemory = getRamMemory();
        Processor processor = getProcessor();
        TypeOS operationSystem = getOS();
        
        Laptop laptop = new Laptop(name, brandType, displ, memory, ramMemory, processor, operationSystem);

        automat.addProduct(laptop);

    }

    private static TypeOS getOS() {

        if (brandType == BrandType.APPLE) {

            return TypeOS.MACOS;

        }

        int type = rand.nextInt(3);

        switch (type) {
            case 0:
                return TypeOS.FREEBSD;
            case 1:
                return TypeOS.LINUX;
            case 2:
                return TypeOS.WINDOWS;
            default:
                return TypeOS.FREEBSD;
        }

    }

    private static Display getDisplay() {

        return new Display(brandType, (rand.nextInt((14 - 20) + 1) + 20));

    }

    private static MainMemory getMemory() {
        
        int type = rand.nextInt(3);

        switch (type) {

            case 0:
                return new MainMemory(brandType.toString(), brandType, MemorySize.K, MemoryType.SSD);

            case 1:
                return new MainMemory(brandType.toString(), brandType, MemorySize.F, MemoryType.HDD);

            case 2:
                return new MainMemory(brandType.toString(), brandType, MemorySize.J, MemoryType.SSD);

            default:
                return new MainMemory(brandType.toString(), brandType, MemorySize.H, MemoryType.SSD);

        }

    }

    private static RamMemory getRamMemory() {

        return new RamMemory(
                brandType.toString(), brandType, MemorySize.E, (rand.nextInt((1800 - 3000) + 1) + 3000), MemoryType.DDR4);

    }

    private static Processor getProcessor() {

        return new Processor(brandType.toString(), brandType, (rand.nextInt((2 - 5) + 1) + 5));

    }


    private LaptopFabric() {}

}
