package HomeWork.HomeWork_03;

import Class.Automats.DeviceAutomat.LaptopAutomat.LaptopAutomat;
import Class.Products.Devices.*;
import Enum.Device.*;


/* Добавить к вендинговому аппарату возможность итерирования */


public class program {

    public static void main(String[] args) {

        LaptopAutomat<Laptop> mvideo_laptops = new LaptopAutomat<Laptop>();

        Laptop ASUS_01 = new Laptop(
                "TUF 355",
                BrandType.ASUS,
                new Display("15", BrandType.ASUS, 15),
                new MainMemory("EVO 990", BrandType.SAMSUNG, MemorySize.L,
                        MemoryType.SSD),
                new RamMemory("9980", BrandType.HYNIX, MemorySize.C, 2800, MemoryType.DDR4),
                new Processor("I9", BrandType.INTEL, 3.4f),
                TypeOS.WINDOWS);

        Laptop ASUS_02 = new Laptop(
                "RAZOR 355",
                BrandType.ASUS,
                new Display("15", BrandType.ASUS, 15),
                new MainMemory("EVO 900", BrandType.SAMSUNG, MemorySize.K,
                        MemoryType.SSD),
                new RamMemory("9980", BrandType.HYNIX, MemorySize.D, 1800,
                        MemoryType.DDR4),
                new Processor("I9", BrandType.INTEL, 3.4f),
                TypeOS.FREEBSD);

        Laptop APPLE_01 = new Laptop(
                "MACBOOK AIR",
                BrandType.APPLE,
                new Display("13", BrandType.APPLE, 13),
                new MainMemory("ALP 999", BrandType.SAMSUNG, MemorySize.M,
                        MemoryType.SSD),
                new RamMemory("Memory", BrandType.APPLE, MemorySize.C, 5000,
                        MemoryType.DDR5),
                new Processor("M2", BrandType.APPLE, 3.4f),
                TypeOS.MACOS);

        mvideo_laptops.addProduct(ASUS_01);
        mvideo_laptops.addProduct(ASUS_02);
        mvideo_laptops.addProduct(APPLE_01);

        for (var iterable_element : mvideo_laptops) {

            System.out.println(iterable_element);
            
        }

        System.out.println("\nСортировка по частоте оперативки\n");

        mvideo_laptops.getProducts().sort((x, y) -> Integer.compare(x.gRamMemory().gFrequency(), y.gRamMemory().gFrequency()));

        for (var iterable_element : mvideo_laptops) {

            System.out.println(iterable_element);

        }
        
    }
    
}
