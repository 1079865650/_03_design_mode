package date_04_06.Prototype.sub;

import date_04_06.Prototype.inter.PrototypeCapable;

public class Movie implements PrototypeCapable {
 
    private String name = "钢铁侠";
 
    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("拷贝Movie对象");
        return (Movie)super.clone();
    }
 
    @Override
    public String toString() {
        return "Movie{name='" + name + "'}";
    }
}
