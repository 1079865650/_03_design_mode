package date_04_06.TemplateMethod.sub;

public class ConcreteClass2 extends AbstractClass{
    @Override
    protected void doSomething() {
        System.out.println("我是2 doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("我是2 doSomething");
    }

    @Override
    public boolean isDoAnything() {
        return false;
    }
}
