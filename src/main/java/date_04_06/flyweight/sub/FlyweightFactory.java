package date_04_06.flyweight.sub;

import date_04_06.flyweight.inter.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

    public Flyweight factory(Character state){
        Flyweight fly = files.get(state);
        if(fly == null){
            fly = new ConcreteFlyweight(state);
            files.put(state, fly);
        }
        return fly;
    }
}
