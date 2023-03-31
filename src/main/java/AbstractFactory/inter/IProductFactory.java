package AbstractFactory.inter;

// 产品工厂接口
public interface IProductFactory {

    // 生产手机
    IPhoneProduct phoneProduct();

    // 生成路由器
    IRouteProduct routerProduct();

}
