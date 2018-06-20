package org.zipcoder.store;

import java.util.Objects;

public class User {

    private long id;
    private String name;

    public User(){}

    public User(long id) {
        this.id = id;
    }

    public User(String name) {
        this.name = name;
    }

    public User(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int hashCode(){
        if (getName() == null)
            return (int) id;
        else
            return (int) id + getName().hashCode();
    }

    @Override
    public boolean equals(Object o){
        boolean answer =false;
        User user = (User) o;
        if ((this.getId() == user.getId()) && (this.getName() == user.getName())) {
            answer = true;
        }
        return answer;
    }
}

