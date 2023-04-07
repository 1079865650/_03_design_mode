package date_04_07.factory_pattern.sub;

public class FactoryMethodTest {
    static void print(Coffee[] c){
        for(Coffee coffee : c){
            System.out.println(coffee.getName());
        }
    }

    public static void main(String[] args) {
        ChinaCoffeeFactory chinaCoffeeFactory = new ChinaCoffeeFactory();
        Coffee[] coffee = chinaCoffeeFactory.createCoffee();
        System.out.println("中国咖啡工厂可以生产的咖啡有");
        print(coffee);
    }
}
