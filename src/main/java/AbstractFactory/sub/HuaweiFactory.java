package AbstractFactory.sub;

import AbstractFactory.inter.IPhoneProduct;
import AbstractFactory.inter.IProductFactory;
import AbstractFactory.inter.IRouteProduct;

public class HuaweiFactory implements IProductFactory {
    @Override
    public IPhoneProduct phoneProduct() {
        return new HuaweiPhone();  // 返回了接口的实现类 工厂只抓大头 反正接口可以返回接口的实现类
    }

    @Override
    public IRouteProduct routerProduct() {
        return new HuaweiRouter();
    }
}
