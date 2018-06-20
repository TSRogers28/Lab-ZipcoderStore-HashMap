package org.zipcoder.store;

import java.util.ArrayList;
import java.util.List;

public class ListMap implements MyMap {
    // instance field that is intialize to an ArrayList
    private List<Entry> entries = new ArrayList<>();

    public ListMap(){
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public boolean isEmpty() {
        return entries.isEmpty();
    }

    @Override
    public Cart get(User key) {

        for(Entry e : entries)
            if (e.getKey().equals(key))
                return e.getValue();

        return null;
    }

    @Override
    public void put(User key, Cart value) {
        if (get(key) != null) remove(key);
        entries.add(new Entry(key, value));
    }


    @Override
    public List<User> getKeys() {
        List<User>  users = new ArrayList<>();
        for (Entry e : entries)
            users.add(e.getKey());
        return users;
    }

    @Override
    public List<Cart> getValues() {
        List<Cart>  carts = new ArrayList<>();
        for (Entry e : entries)
            carts.add(e.getValue());
        return carts;
    }

    @Override
    public Cart remove(User key) {
        Cart cart = null;
        for(Entry e : entries)
            if (e.getKey().equals(key)) {
                cart = e.getValue();
                entries.remove(e);
                break;
            }

        return cart;
    }
}

