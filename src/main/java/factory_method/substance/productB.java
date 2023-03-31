package factory_method.substance;

import factory_method.inter.Product;

public class productB implements Product {
    @Override
    public void show() {
        System.out.println("具体产品B");
    }
}
