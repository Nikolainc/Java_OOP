package Class.Products;

import Enum.*;

public abstract class Product {

    protected TypeProduct type;
    protected String name;

    protected Product(String name, TypeProduct type) {

        this.name = name;
        this.type = type;

    }

    public String getName() {

        return this.name;

    }

    public TypeProduct gTypeProduct() {

        return this.type;

    }

    @Override
    public String toString() {

        return String.format("\nType: %s\nName: %s", type, name);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Product) {

            return this.equals(((Product) obj).getName());

        }

        return false;

    }

    public boolean equals(String obj) {

        return this.name.equals(obj);

    }

    public boolean equals(TypeProduct type) {

        return this.type.equals(type);

    }
    
}