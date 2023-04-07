package date_04_06.TemplateMethod.sub;

public class Client {
    public static void main(String[] args) {
        ConcreteClass1 class1 = new ConcreteClass1();
        ConcreteClass2 class2 = new ConcreteClass2();
        ((ConcreteClass1) class1).setIsDoAnything(false);
        class1.templateMethod();
        System.out.println(class1.toString());
        class2.templateMethod();
        System.out.println(class2.toString());
    }

}
