package org.zipcoder.store;

import java.util.*;

public class MyHashMap implements MyMap{
    // final field that doesn't change for any object
    private static final int BUCKET_SIZE = 100;

    // instance field that can only be set once. It is different for every Object
    private final List<Entry>[] entries;

    public MyHashMap(){
        entries = new List[BUCKET_SIZE];

        for(int i = 0; i < BUCKET_SIZE; i++) {
            entries[i] = new ArrayList<>();
        }
    }

    @Override
    public int size() {
        int count = 0;
        for(List<Entry> e : entries)
            count += e.size();
        return count;
    }

    @Override
    public boolean isEmpty() {
        return (size() ==0);
    }

    @Override
    public Cart get(User key) {
        Cart cart = null;
        List<Entry> entry = entries[bucketIndex(key)];
        for(Entry e : entry) {
            if (e.getKey().equals(key))
                cart =  e.getValue();
        }
        return cart;
    }

    @Override
    public void put(User key, Cart value) {
        entries[bucketIndex(key)].add(new Entry(key, value));
    }

    @Override
    public List<User> getKeys() {
        List<User> users = new ArrayList<>();
        for(List<Entry> entry : entries)
            for (Entry e: entry)
                users.add(e.getKey());
        return users;
    }

    @Override
    public List<Cart> getValues() {
        List<Cart> carts = new ArrayList<>();
        for(List<Entry> entry : entries)
            for (Entry e: entry)
                carts.add(e.getValue());
        return carts;
    }

    @Override
    public Cart remove(User key) {
        Cart cart = null;
        List<Entry> entry = entries[bucketIndex(key)];
        for(Entry e : entry){
            if(e.getKey().equals(key)){
                cart = e.getValue();
                entry.remove(e);
                break;
            }
        }
        return cart;
    }

    private int bucketIndex(User key){
        return Math.abs(key.hashCode()) % entries.length;
    }
}

