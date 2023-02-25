package Class.Products;

import java.util.Objects;

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

        return String.format("\nType: %s, Name: %s", type, name);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj.getClass() == this.getClass()) {

            return this.equals(((Product) obj).getName(), ((Product)obj).gTypeProduct());

        }

        return false;

    }

    public boolean equals(String name, TypeProduct type) {

        return this.equals(name) && this.equals(type);

    }

    public boolean equals(String name) {

        return this.name.equals(name);

    }

    public boolean equals(TypeProduct type) {

        return this.type.equals(type);

    }

    @Override
    public int hashCode() {
        
        return 13 * Objects.hash(this.name, this.type);

    }
    
}