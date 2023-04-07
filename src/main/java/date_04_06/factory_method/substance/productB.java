package date_04_06.factory_method.substance;

import date_04_06.factory_method.inter.Product;

public class productB implements Product {
    @Override
    public void show() {
        System.out.println("具体产品B");
    }
}
