package Prototype.sub;

import Prototype.inter.PrototypeCapable;

public class Show implements PrototypeCapable {
 
    private String name = "维多利亚的秘密";
 
    @Override
    public Show clone() throws CloneNotSupportedException {
        System.out.println("拷贝Show对象实例");
        return (Show)super.clone();
    }
 
    @Override
    public String toString() {
        return "Show{name='" + name + "'}";
    }
}
