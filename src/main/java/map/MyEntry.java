package map;

/**
 * Created by yangch on 2016/9/8.
 */
public class MyEntry {
    public int hash;
    public Object key;
    public Object value;
    public MyEntry next;

    public MyEntry() {
    }

    public MyEntry(Object key, Object value, MyEntry next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public MyEntry getNext() {
        return next;
    }

    public void setNext(MyEntry next) {
        this.next = next;
    }
}
