package AbstractFactory.sub;

import AbstractFactory.inter.IPhoneProduct;
import AbstractFactory.inter.IProductFactory;
import AbstractFactory.inter.IRouteProduct;

public class XiaomiFactory implements IProductFactory {
 
    @Override
    public IPhoneProduct phoneProduct() {
    	return new XiaomiPhone();
    }
 
    @Override
    public IRouteProduct routerProduct() {
	return new XiaomiRouter();
    }
}
