package HomeWork.HomeWork_02;

import Class.Automats.DeviceAutomat.LaptopAutomat.LaptopAutomat;
import Class.Products.Devices.*;
import Class.Requests.LaptopRequests.*;
import Enum.Device.*;

/* Подумать над структурой класса Ноутбук для магазина техники-выделить поля и методы. Реализовать в java. Создать множество ноутбуков.
Написать метод,который будет запрашивать у пользователя критерий(или критерии)фильтрации и выведет ноутбуки,отвечающие фильтру.
Критерии фильтрации можно хранить в Map.Например:“Введите цифру,соответствующую необходимому критерию:
1-ОЗУ
2-Объем ЖД
3-Операционная система
4-Цвет…
Далее нужно запросить минимальные значения для указанных критериев-сохранить параметры фильтрации можно также в Map.Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

public class program {

    public static void main(String[] args) {

        LaptopAutomat<Laptop> mvideo_laptops = new LaptopAutomat<Laptop>();

        Laptop ASUS_01 = 
        new Laptop(
            "TUF 355", 
            BrandType.ASUS, 
            new Display("15", BrandType.ASUS, 15), 
            new MainMemory("EVO 990", BrandType.SAMSUNG, MemorySize.L, 
                    MemoryType.SSD), 
            new RamMemory("9980", BrandType.HYNIX, MemorySize.C, 2800, MemoryType.DDR4), 
            new Processor("I9", BrandType.INTEL, 3.4f), 
            TypeOS.WINDOWS
            );

        Laptop ASUS_02 = new Laptop(
                "RAZOR 355",
                BrandType.ASUS,
                new Display("15", BrandType.ASUS, 15),
                new MainMemory("EVO 900", BrandType.SAMSUNG, MemorySize.K, 
                        MemoryType.SSD),
                new RamMemory("9980", BrandType.HYNIX, MemorySize.D, 2800, 
                        MemoryType.DDR4),
                new Processor("I9", BrandType.INTEL, 3.4f),
                TypeOS.FREEBSD);

        Laptop APPLE_01 = new Laptop(
                "MACBOOK AIR",
                BrandType.APPLE,
                new Display("13", BrandType.APPLE, 13),
                new MainMemory("ALP 999", BrandType.SAMSUNG, MemorySize.K, 
                        MemoryType.SSD),
                new RamMemory("Memory", BrandType.APPLE, MemorySize.C, 2888, 
                        MemoryType.DDR5),
                new Processor("M2", BrandType.APPLE, 3.4f),
                TypeOS.MACOS);

        System.out.println(mvideo_laptops.addProduct(ASUS_01));
        System.out.println(mvideo_laptops.addProduct(ASUS_01));
        System.out.println(mvideo_laptops.addProduct(ASUS_02));
        System.out.println(mvideo_laptops.addProduct(APPLE_01));

        System.out.println(mvideo_laptops.getProducts(new RequestMemorySize<Laptop>(MemoryType.DDR5, 100)));
        System.out.println(mvideo_laptops.getProducts(new RequestMemoryType<Laptop>(MemoryType.SSD)));

        System.out.println(mvideo_laptops.getProducts(new RequestOS<Laptop>(TypeOS.FREEBSD)));
        
    }

}
