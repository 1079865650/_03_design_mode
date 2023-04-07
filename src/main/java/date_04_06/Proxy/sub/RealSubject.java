package date_04_06.Proxy.sub;

import date_04_06.Proxy.inter.Subject;

public class RealSubject implements Subject {
    private String name = "byhieg";
    @Override
    public void visit() {
        System.out.println("name");
    }
}
