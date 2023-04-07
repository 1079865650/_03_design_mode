package date_04_06.Mediator.sub;

import date_04_06.Mediator.inter.Colleague;

public class ColleagueA implements Colleague {
    ConcreteMediator mediator;
    String name;
    public ColleagueA(ConcreteMediator mediator){
        this.mediator = mediator;
        mediator.registerColleagueA(this);
    }

    @Override
    public void giveMess(String[] mess) {
        mediator.deliverMess(this,mess);
    }

    @Override
    public void receiveMess(String mess) {
        System.out.println(name+"收到的信息");
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
