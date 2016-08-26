package com.codekul.brushup.interfaces;

/**
 * Created by aniruddha on 26/8/16.
 */
public class Human implements GpsListener{

    private int steps;

    public void walk(){
        steps++;
    }

    @Override
    public String location() {
        return "At Home";
    }
}
