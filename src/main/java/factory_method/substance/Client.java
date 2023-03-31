package factory_method.substance;

import factory_method.inter.Product;

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
