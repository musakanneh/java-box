package com.javabox.dsa;
import java.util.LinkedList;

public class HashTable {
    // HashTable
    // HashMap<Integer, String> map = new HashMap<>();
    // get (k): v
    // remove (k): removes the corresponding values
    // k: int
    // v: string
    // collision: chaining strategy (storing value pairs in linked lists)
    // LinkedList<Entry>[]
    // Entry: key value pairs
    // put (k, v)
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // TODO: add constructor to pass the initial capacity
    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key);
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }
        var bucket = entries[index];
        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        entries[index].addLast(new Entry(key, value));
    }

    public String get(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    //  define the hash code to position key and value pairs in the map
    private int hash(int key) {
        // reduce available key to the size of our array
        // TODO: handle negative keys
        return key % entries.length;
    }
}
