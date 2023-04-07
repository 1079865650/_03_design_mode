package date_04_06.Decorator.sub;

public class Shirt extends ClothingDecorator{
    Person person;
    public Shirt(Person person)
    {
        this.person = person;
    }
    @Override
    public String getDescription() {
        return person.getDescription() + "a shirt";
    }

    @Override
    public double cost() {
        return 100+person.cost();
    }
}
