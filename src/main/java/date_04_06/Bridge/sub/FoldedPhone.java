package date_04_06.Bridge.sub;

import date_04_06.Bridge.inter.Brand;

public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }
    public void open(){
        super.open();
        System.out.println("折叠样式手机");
    }
    public void close(){
        super.close();
        System.out.println("折叠样式手机");
    }
    public void call(){
        super.call();
        System.out.println("折叠样式手机");
    }

}
