package date_04_06.Composite.sub;

public class Leaf extends Component{

    @Override
    public void addComposite(Component c) {
        System.out.println("不是子容器");
    }

    @Override
    public void removeComposite(Component c) {
        System.out.println("不是子容器");
    }

    @Override
    public Component getComposite(int i) {
        System.out.println("不是子容器");
        return null;
    }

    @Override
    public void operation() {
        System.out.println("业务方法");
    }
}
