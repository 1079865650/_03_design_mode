package AbstractFactory.sub;

import AbstractFactory.inter.IPhoneProduct;
import AbstractFactory.inter.IProductFactory;
import AbstractFactory.inter.IRouteProduct;

public class Client {
    public static void main(String[] args) {
        System.out.println("=====小米产品=====");
        // 创建小米工厂
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        // 生产小米手机
        IPhoneProduct xiaomiPhones = xiaomiFactory.phoneProduct();
        xiaomiPhones.start();
        xiaomiPhones.sendSMS();
        //生产小米路由器
        IRouteProduct xiaomiRouter = xiaomiFactory.routerProduct();
        xiaomiRouter.openwifi();
        xiaomiRouter.setting();
        //创建华为工厂
        IProductFactory huaweiFactory = new HuaweiFactory();

        //生产华为手机
        IPhoneProduct huaweiPhone = huaweiFactory.phoneProduct();
        huaweiPhone.start();
        huaweiPhone.sendSMS();

        //生产华为路由器
        IRouteProduct huaweiRouter = huaweiFactory.routerProduct();
        huaweiRouter.openwifi();
        huaweiRouter.setting();
    }
}
