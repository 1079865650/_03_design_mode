package date_04_06.Composite.sub;

public abstract class Component {
    public abstract void addComposite(Component c);
    public abstract void removeComposite(Component c);
    public abstract Component getComposite(int i);
    public abstract void operation();
}

