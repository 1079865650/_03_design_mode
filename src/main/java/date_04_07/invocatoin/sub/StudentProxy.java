package date_04_07.invocatoin.sub;

import date_04_07.invocatoin.inter.Person;

public class StudentProxy implements Person {
    Student stu;
    public StudentProxy(Person stu){
        if(stu.getClass() == Student.class){
            this.stu = (Student)stu;
        }
    }
    @Override
    public void giveMoney() {
        stu.giveMoney();
    }
}
