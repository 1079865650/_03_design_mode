package date_04_06.TemplateMethod.sub;

public abstract class AbstractClass {
    protected abstract void doSomething();
    protected abstract void doAnything();

    public final void templateMethod(){
        this.doSomething();
        if(this.isDoAnything()){
            this.doAnything();
        }
    }
    public boolean isDoAnything(){
        return true;
    }

}
