package date_04_06.Bridge.sub;

import date_04_06.Bridge.inter.Brand;

public abstract class Phone {
    private Brand brand;
    public Phone(Brand brand){
        super();
        this.brand = brand;
    }
    protected void open(){ //protected
        this.brand.open();
    }
    protected void close(){
        brand.close();
    }
    protected void call(){
        brand.call();
    }
}
