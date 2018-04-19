package org.zipcoder.store;

import java.util.*;

public class MyHashMap implements MyMap{
    // final field that doesn't change for any object
    private static final int BUCKET_SIZE = 15;

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
        return -1;
    }

    @Override
    public boolean isEmptry() {
        return false;
    }

    @Override
    public Cart get(User key) {
        return null;
    }

    @Override
    public void put(User key, Cart value) {

    }

    @Override
    public List<User> getKeys() {
        return null;
    }

    @Override
    public List<Cart> getValues() {
        return null;
    }

    @Override
    public Cart remove(User key) {
        return null;
    }

    private int bucketIndex(User key){
        return Math.abs(key.hashCode()) % entries.length;
    }
}
