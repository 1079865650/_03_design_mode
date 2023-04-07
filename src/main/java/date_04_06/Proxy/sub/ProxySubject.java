package date_04_06.Proxy.sub;

import date_04_06.Proxy.inter.Subject;

public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject = subject;
    }
    @Override
    public void visit() {
        this.subject = subject;
    }

}
