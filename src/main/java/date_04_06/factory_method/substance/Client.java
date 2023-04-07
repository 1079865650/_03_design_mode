package date_04_06.factory_method.substance;

import date_04_06.factory_method.inter.Product;

public class Client {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        Product productA = factoryA.manufacture();
        productA.show();

        FactoryB factoryB = new FactoryB();
        Product productB = factoryB.manufacture();
        productB.show();
    }
}
