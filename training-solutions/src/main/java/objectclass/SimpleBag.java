package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    private List<Object> items = new ArrayList<>();
    private int cursor;

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public int size() {
        return items.size();
    }

    public void beforeFirst() {
        cursor = 0;
    }
    public boolean hasNext() {
        return cursor < items.size();
    }

    public Object next() {
        return items.get(cursor++);
    }

    public boolean contains(Object item) {
        return items.contains(item);
    }

    public int getCursor() {
        return cursor;
    }
}
