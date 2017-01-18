package com.spring.structs2.beans;

/**
 * Created by Administrator on 2017-01-17.
 */
public class Person {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void hello(){
        System.out.println("My name is " + username);
    }
}
