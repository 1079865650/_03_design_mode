package date_04_06.Memento.sub;

/**
 * 备忘录管理者
 */
public class Caretaker {
 
  private Memento memento;
 
  public void setMemento(Memento m) {
    memento = m;
  }
 
  public Memento getMemento() {
    return memento;
  }
}