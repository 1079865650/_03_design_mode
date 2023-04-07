package date_04_06.Composite.sub;

import java.util.ArrayList;

public class Composite extends Component{

    private ArrayList<Component> list = new ArrayList<Component>();
    @Override
    public void addComposite(Component c) {
        list.add(c);
    }

    @Override
    public void removeComposite(Component c) {
        list.remove(c);
    }

    @Override
    public Component getComposite(int c) {
        Component c1 = list.get(c);
        return null;
    }

    @Override
    public void operation() {
        for(Object obj : list){
            ((Component)obj).operation();
        }
    }
}
