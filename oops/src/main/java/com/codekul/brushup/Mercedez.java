package com.codekul.brushup;

/**
 * Created by aniruddha on 26/8/16.
 */

//Mercedez is a Car
public class Mercedez extends Car{

    private boolean isCruizeControl;

    public void enableCruzeControl(){
        isCruizeControl = true;
        wheels = 5;
        windows = 3;
    }
}
