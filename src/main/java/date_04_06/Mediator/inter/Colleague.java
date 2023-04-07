package date_04_06.Mediator.inter;

public interface Colleague {
    public void giveMess(String[] mess);
    public void receiveMess(String mess);
    public void setName(String name);
    public String getName();
}
