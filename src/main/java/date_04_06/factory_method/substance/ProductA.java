package date_04_06.factory_method.substance;

import date_04_06.factory_method.inter.Product;

public class ProductA implements Product {  // 实现了产品接口 然后再生成具体产品
    @Override
    public void show() {
        System.out.println("具体产品A");
    }
}
