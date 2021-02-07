package com.pachetepachete;

import java.util.*;

public class ArrayMap<K, V> extends AbstractMap<K, V> {
    Vector<K> keys;
    Vector<V> values;

    public ArrayMap() {
        this.keys = new Vector<>();
        this.values = new Vector<>();
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < keys.size(); ++i) {
            ans.append("Key: ").append(keys.get(i)).append(" Value: ").append(values.get(i)).append('\n');
        }

        return ans.toString();
    }

    @Override
    public V put(K key, V value) {
        if (get(key) != null) {
            int index = keys.indexOf(key);
            values.set(index, value);
            return value;
        }

        keys.add(key);
        values.add(value);

        return value;
    }

    @Override
    public V get(Object key) {
        int index = keys.indexOf(key);

        if (index == -1) {
            return null;
        }

        return values.get(index);
    }

    public Set<K> keySet() {
        return new HashSet<>(keys);
    }

    public Collection<V> values() {
        return new ArrayList<>(values);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        HashSet<Map.Entry<K,V>> hs = new HashSet<>();

        for (int i = 0; i < keys.size(); ++i) {
            hs.add(new ArrayMapEntry<>(keys.get(i), values.get(i)));
        }

        return hs;
    }

    static class ArrayMapEntry<K, V> implements Map.Entry<K, V> {
        K key;
        V value;

        public ArrayMapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            V old = this.value;
            this.value = value;
            return old;
        }

        @Override
        public boolean equals(Object obj) {
            return  (this.getKey()==null ?
                    ((ArrayMapEntry<K, V>)obj).getKey()==null : this.getKey().equals(((ArrayMapEntry<K, V>)obj).getKey()))  &&
                    (this.getValue()==null ?
                            ((ArrayMapEntry<K, V>)obj).getValue()==null : this.getValue().equals(((ArrayMapEntry<K, V>)obj).getValue()));
        }

        @Override
        public int hashCode() {
            return (this.getKey()==null   ? 0 : this.getKey().hashCode()) ^
                    (this.getValue()==null ? 0 : this.getValue().hashCode());
        }

        @Override
        public String toString() {
            return "Key: " + this.key + " Value: " + this.value + '\n';
        }
    }
}
