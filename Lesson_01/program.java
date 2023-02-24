package Lesson_01;

import Class.Automats.DrinksAutomat.HotDrinksAutomat.HotDrinksAutomat;
import Class.Products.Drinks.HotDrinks;

/* Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре */

class program {

    public static void main(String[] args) {

        String latteName = "Latte";
        String AmericanoName = "Americano";

        HotDrinksAutomat<HotDrinks> coffeeMachine = new HotDrinksAutomat<>();

        HotDrinks latte100 = new HotDrinks(latteName, 100, 65);
        HotDrinks latte1001 = new HotDrinks(latteName, 100, 65);
        HotDrinks latte250 = new HotDrinks(latteName, 250, 65);
        HotDrinks americano100 = new HotDrinks(AmericanoName, 100, 90);
        HotDrinks americano250 = new HotDrinks(AmericanoName, 250, 90);

        System.out.println(coffeeMachine.addProduct(latte100));
        System.out.println(coffeeMachine.addProduct(latte1001));
        System.out.println(coffeeMachine.addProduct(latte100));
        System.out.println(coffeeMachine.addProduct(latte250));
        System.out.println(coffeeMachine.addProduct(americano100));
        System.out.println(coffeeMachine.addProduct(americano250));

        System.out.println(coffeeMachine.getProduct("Latte"));
        System.out.println(coffeeMachine.getProduct("Chocolate"));
        System.out.println(coffeeMachine.getProduct("Americano",100,90));
        
    }
}