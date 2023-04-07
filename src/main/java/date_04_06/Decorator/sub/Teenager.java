package date_04_06.Decorator.sub;

public class Teenager extends Person{
    public Teenager(){
        description = "Shopping List";
    }
    @Override
    public double cost() {
        return 0;
    }
}
