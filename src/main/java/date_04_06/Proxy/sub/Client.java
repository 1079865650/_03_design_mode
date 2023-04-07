package date_04_06.Proxy.sub;

public class Client {
    public static void main(String[] args) {
        ProxySubject subject = new ProxySubject(new RealSubject());
        subject.visit();
    }
    
}
