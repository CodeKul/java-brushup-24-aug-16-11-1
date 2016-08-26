package com.codekul.brushup;

/**
 * Created by aniruddha on 26/8/16.
 */
public class InValidForceException extends RuntimeException {

    private double force;

    public InValidForceException(double force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Force is not valid "+force;
    }
}
