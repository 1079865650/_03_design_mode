package date_04_06.Observer.inter;

public interface Subscriber {
    int receive(String publisher, String articleName);
}
