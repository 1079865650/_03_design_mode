package factory_method.substance;

import factory_method.inter.Product;
import factory_method.inter.ProductFactory;

public class FactoryB implements ProductFactory {
    @Override
    public Product manufacture() {
        System.out.println("具体工厂B");
        return new productB();
    }
}
