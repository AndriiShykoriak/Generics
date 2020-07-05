package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListModify<T extends Comparable<? super T>> {
    private List<T> list = new ArrayList<T>();

    public void add(T t) {
        list.add(t);
    }

    public T printLargest() {
        return Collections.max(list);
    }

    public T printSmallest() {
        return Collections.min(list);
    }
}
