package com.codekul.brushup.interfaces;

/**
 * Created by aniruddha on 26/8/16.
 */
public /*abstract*/ class Bike implements GpsListener{

    public void speedUp(){

    }

    @Override
    public String location() {
        return "on Road";
    }
}
