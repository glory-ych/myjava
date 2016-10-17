package map;


/**
 * Created by yangch on 2016/9/8.
 */
public class MyHashMap<K, V> {
    private final int MAX_CAPACITY = 1 << 30;
    private final double FACTOR = 0.73;
    private final int INIT_LENGTH = 16;
    private MyEntry<K, V>[] table;
    private int size;

    public MyHashMap() {
        table = new MyEntry[INIT_LENGTH];
    }

    public MyHashMap(int length) {
        table = new MyEntry[length];
    }

    public V get(Object key) {
        if (key == null) {
            return table[0].getValue();
        }
        int index = this.index(hash(key));
        MyEntry<K, V> entry = table[index];
        if (entry != null) {
            for (MyEntry<K, V> e = entry; e != null; e = e.next) {
                if (e.getKey().equals(key)) {
                    return e.getValue();
                }
            }
        }
        return null;
    }

    public Object put(Object key, Object value) {
        if (key == null) {
            return this.putNullKey(value);
        }
        if (size / table.length >= FACTOR) {
            this.resize();
        }
        int index = this.index(hash(key));
        MyEntry entry = table[index];
        if (entry != null) {
            Object old;
            for (MyEntry e = entry; e != null; e = e.next) {
                if (e.getKey() == key || e.getKey().equals(key)) {
                    old = e.getValue();
                    e.setValue(value);
                    return old;
                }
            }
        } else {
            MyEntry newEntry = new MyEntry(key, value, entry);
            table[index] = newEntry;
            if (entry == null) {
                size++;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    private void resize() {
        if (table.length > MAX_CAPACITY) {

        }
        int newLength = table.length << 2;
        MyEntry[] newTable = new MyEntry[newLength];
        System.arraycopy(table, 0, newTable, 0, table.length);
        table = newTable;
    }

    private Object putNullKey(Object value) {
        MyEntry nullEntry = table[0];
        Object old;
        if (nullEntry == null) {
            nullEntry = new MyEntry(null, value, null);
            table[0] = nullEntry;
        } else {
            old = nullEntry.getValue();
            nullEntry.setValue(value);
            return old;
        }
        return null;
    }

    private int index(int hash) {
        return hash & (table.length - 1);
    }

    private int hash(Object key) {
        int h = key.hashCode();
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

    public static <OK,OV> MyHashMap<OK,OV> getInstance() {
        return new MyHashMap<OK,OV>();
    }
}
