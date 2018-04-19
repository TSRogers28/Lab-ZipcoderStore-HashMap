package org.zipcoder.store;

import java.util.ArrayList;
import java.util.List;

public class ListMap implements MyMap {
    // instance field that is intialize to an ArrayList
    private List<Entry> entries = new ArrayList<>();

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
        // find the cart associate with the key
        return null;
    }

    @Override
    public void put(User key, Cart value) {
        // add the key, value entry to the entries list
    }


    @Override
    public List<User> getKeys() {
        // get all the keys in the map
        return null;
    }

    @Override
    public List<Cart> getValues() {
        // get all the values in the map
        return null;
    }

    @Override
    public Cart remove(User key) {
        return null;
    }
}
