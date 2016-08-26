package com.codekul.brushup;

import java.io.File;
import java.io.IOException;

/**
 * Created by aniruddha on 26/8/16.
 */
public class Physics {

    private int result;

    public int acceleration(double force, int mass){

        File file = new File("/home/aniruddha/Desktop/my.txt");

        try {
            file.createNewFile();
           result = (int)force/mass; // throw new ArithmeticException();
        }
        catch (ArithmeticException e){
            result = 0;
        } catch (IOException e) {
           e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public int torque(double force, float radius, double angle) throws IOException {

        if(force < 0){
            throw new InValidForceException(force);
        }
        File file = new File("/home/aniruddha/Desktop/my.txt");
        file.createNewFile();

        return result = (int)(force * radius * Math.sin(angle));
    }
}
