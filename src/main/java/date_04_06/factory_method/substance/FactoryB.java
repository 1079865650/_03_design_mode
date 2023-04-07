package date_04_06.factory_method.substance;

import date_04_06.factory_method.inter.Product;
import date_04_06.factory_method.inter.ProductFactory;

public class FactoryB implements ProductFactory {
    @Override
    public Product manufacture() {
        System.out.println("具体工厂B");
        return new productB();
    }
}
