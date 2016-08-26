package com.codekul.brushup.abstractclasses;

/**
 * Created by aniruddha on 26/8/16.
 */
public abstract class Animal {

    private String country;

    public abstract void walk();

    public abstract void eat();

    public void country(){
        country = "India";
    }
}
