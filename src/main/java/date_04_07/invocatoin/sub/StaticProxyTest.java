package date_04_07.invocatoin.sub;

import date_04_07.invocatoin.inter.Person;

public class StaticProxyTest {
    public static void main(String[] args) {
        Person zhangsan = new Student("张三");
        Person monitor = new StudentProxy(zhangsan);
        monitor.giveMoney();
    }
}
