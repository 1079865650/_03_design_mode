package date_04_07.invocatoin.sub;

import date_04_07.invocatoin.inter.Person;

public class Student implements Person {
    private String name;
    public Student(String name){
        this.name = name;
    }
    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费50元");
    }

}
