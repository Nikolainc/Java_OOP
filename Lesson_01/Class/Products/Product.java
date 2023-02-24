package Lesson_01.Class.Products;

import Lesson_01.Enum.*;

public abstract class Product {

    protected TypeProduct type;
    protected int cost;
    protected String name;

    protected Product(String name, int cost, TypeProduct type) {

        this.name = name;
        this.cost = cost;
        this.type = type;

    }

    public String getName() {

        return this.name;

    }

    @Override
    public String toString() {

        return String.format("\nType: %s\nName: %s\nCost: %s RUB", type, name, cost);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Product) {

            return this.name.equals(((Product) obj).getName());

        }

        return false;

    }

    public boolean equals(String obj) {

        return this.name.equals(obj);

    }
    
}
