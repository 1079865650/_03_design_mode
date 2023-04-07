package date_04_06.Mediator.sub;

import date_04_06.Mediator.inter.Colleague;

public class ColleagueB implements Colleague {
    ConcreteMediator mediator;//中介者
    String name;
 
    public ColleagueB(ConcreteMediator mediator) {
        this.mediator = mediator;
        mediator.registerColleagueB(this);
    }
 
    @Override
    public void giveMess(String[] mess) {
        mediator.deliverMess(this,mess);
    }
 
    @Override
    public void receiveMess(String mess) {
        System.out.println(name+"收到的信息:");
        System.out.println("\t"+mess);
    }
 
    @Override
    public void setName(String name) {
        this.name=name;
    }
 
    @Override
    public String getName() {
        return name;
    }
}