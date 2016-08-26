package com.codekul.brushup;

/**
 * Created by aniruddha on 26/8/16.
 */
public class Car {

    private int version;
    private double speed; //state
    public int wheels;
    protected int windows;

    public void increaseSpeed(){ // behaviour
        speed  = speed +10;
    }

    public double/*return type is not imp*/ increaseSpeed(int x){
        speed += x;
        return speed;
    }

    public void applyBreaks(){
        speed = 0;
    }
}
