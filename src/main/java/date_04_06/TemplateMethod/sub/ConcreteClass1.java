package date_04_06.TemplateMethod.sub;

public class ConcreteClass1 extends AbstractClass{
    private boolean isFlag = true;
    @Override
    protected void doSomething() {
        System.out.println("我是1 doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("我是1 doAnything");
    }

    @Override
    public boolean isDoAnything() {
        return this.isFlag;
    }

    protected void setIsDoAnything(boolean isDo){
        this.isFlag = isDo;
    }
}
