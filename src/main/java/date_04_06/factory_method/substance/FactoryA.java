package date_04_06.factory_method.substance;

import date_04_06.factory_method.inter.Product;
import date_04_06.factory_method.inter.ProductFactory;

public class FactoryA implements ProductFactory {
    @Override
    public Product manufacture() {
        System.out.println("具体工厂A");
        return new ProductA();
    }
}
