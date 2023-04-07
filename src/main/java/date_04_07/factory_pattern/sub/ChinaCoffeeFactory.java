package date_04_07.factory_pattern.sub;

public class ChinaCoffeeFactory extends CoffeeFactory{
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Cappuccino(), new Latte()};
    }
}
