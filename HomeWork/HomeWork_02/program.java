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

        LaptopAutomat<Laptop> mvideo = new LaptopAutomat<Laptop>();

        Laptop ASUS_01 = 
        new Laptop(
            "TUF 355", 
            BrandType.ASUS, 
            new Display("15", BrandType.ASUS, 15), 
            new MainMemory("EVO 900", BrandType.SAMSUNG, MemorySize.L), 
            new RamMemory("9980", BrandType.HYNIX, MemorySize.C, 2800), 
            new Processor("I9", BrandType.INTEL, 3.4f), 
            TypeOS.WINDOWS
            );

        mvideo.addProduct(ASUS_01);

        System.out.println(mvideo.getProducts(new RequestMainMemorySize<Laptop>(100000000)));
        
    }

}
