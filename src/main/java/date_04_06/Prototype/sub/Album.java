package date_04_06.Prototype.sub;

import date_04_06.Prototype.inter.PrototypeCapable;

public class Album implements PrototypeCapable {
 
    private String name = "无法长大";
 
    @Override
    public Album clone() throws CloneNotSupportedException {
        System.out.println("拷贝Album对象");
        return (Album)super.clone();
    }
 
    @Override
    public String toString() {
        return "Album{name='" + name + "'}";
    }
}
