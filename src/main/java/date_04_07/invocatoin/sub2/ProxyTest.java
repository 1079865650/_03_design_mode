package date_04_07.invocatoin.sub2;

import date_04_07.invocatoin.inter.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Student zhangsan = new Student("张三");
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(zhangsan);
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);
        stuProxy.giveMoney();

    }
}
