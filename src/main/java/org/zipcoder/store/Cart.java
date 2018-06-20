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

    public int hashCode(){
        return (int) id;
    }

    @Override
    public boolean equals(Object o){
        boolean answer =false;
        Cart cart = (Cart) o;
        if (this.getId() == cart.getId()) {
            answer = true;
        }
        return answer;
    }
}

