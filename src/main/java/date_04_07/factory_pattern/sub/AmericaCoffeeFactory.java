package date_04_07.factory_pattern.sub;

public class AmericaCoffeeFactory extends CoffeeFactory{
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Americano(), new Latte()};
    }
}
