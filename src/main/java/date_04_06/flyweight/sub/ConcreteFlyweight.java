package date_04_06.flyweight.sub;

import date_04_06.flyweight.inter.Flyweight;

public class ConcreteFlyweight implements Flyweight {

    private Character intrinsincState = null;


    public ConcreteFlyweight(Character state){
        this.intrinsincState = state;
    }
    @Override
    public void operation(String state) {
        System.out.println("Intrinsic Sate = " + this.intrinsincState);
        System.out.println("Extrinsic Sate = " + state);
    }
}
