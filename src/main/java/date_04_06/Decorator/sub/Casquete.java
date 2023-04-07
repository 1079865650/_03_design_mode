package date_04_06.Decorator.sub;

public class Casquete extends HatDecorator{
    Person person;

    public Casquete(Person person){
        this.person = person;
    }
    @Override
    public String getDescription() {
        return person.getDescription() + "a casequette";
    }

    @Override
    public double cost() {
        return 75 + person.cost();
    }
}
