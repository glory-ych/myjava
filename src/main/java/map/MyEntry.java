package map;

/**
 * Created by yangch on 2016/9/8.
 */
public class MyEntry<K,V> {
    public int hash;
    public K key;
    public V value;
    public MyEntry next;

    public MyEntry() {
    }

    public MyEntry(K key, V value, MyEntry next) {
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

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyEntry getNext() {
        return next;
    }

    public void setNext(MyEntry next) {
        this.next = next;
    }
}
