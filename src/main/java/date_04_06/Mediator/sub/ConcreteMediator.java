package date_04_06.Mediator.sub;

import date_04_06.Mediator.inter.Colleague;

public class ConcreteMediator {
    Colleague colleagueA;
    Colleague colleagueB;
    Colleague colleagueC;
    public void registerColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }
    public void registerColleagueB(ColleagueB colleagueB){
        this.colleagueB = colleagueB;
    }
    public void registerColleagueC(ColleagueC colleagueC){
        this.colleagueC = colleagueC;
    }

    public void deliverMess(Colleague colleague,String[] mess){
        if(colleague==colleagueA){
            if(mess.length >= 2){
                colleagueB.receiveMess(colleague.getName()+mess[0]);
                colleagueC.receiveMess(colleague.getName()+mess[1]);
            }else if(colleague==colleagueB){
                if(mess.length>=2){
                    colleagueA.receiveMess(colleague.getName()+mess[0]);
                    colleagueC.receiveMess(colleague.getName()+mess[1]);
                }
            }else if(colleague==colleagueC){
                if(mess.length>=2){
                    colleagueA.receiveMess(colleague.getName()+mess[0]);
                    colleagueB.receiveMess(colleague.getName()+mess[1]);
                }
            }
        }
    }
}
