package Prototype.sub;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Tom");
        System.out.println(prototype);

        // 拷贝原型对象
        ConcretePrototype clone = prototype.clone();
        System.out.println(clone);
    }
}
