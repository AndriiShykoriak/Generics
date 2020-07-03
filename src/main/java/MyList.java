import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {
    List<T> list = new ArrayList<T>();

    public void add(T t) {
        list.add(t);
    }

    public T largest() {
        T index = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).intValue() > index.intValue()) {
                index = list.get(i);
            }
        }
        return index;
    }

    public T smallest() {
        T index = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).intValue() < index.intValue()) {
                index = list.get(i);
            }
        }
        return index;
    }
}
