package date_04_06.Bridge.sub;

import date_04_06.Bridge.inter.Brand;

public class UpRightPhone extends Phone{ //将抽象部分与它实际部分分离，使他们都可以独立的变化

    // 构造器
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立样式手机");
    }

}
