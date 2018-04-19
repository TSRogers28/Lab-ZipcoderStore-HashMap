package org.zipcoder.store;

import java.util.Objects;

public class Cart {
    private final long id;

    public Cart(long id) {
        this.id = id;
    }

    public long getId(){
        return this.id;
    }
}
