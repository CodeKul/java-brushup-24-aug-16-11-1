package com.codekul.brushup;

import java.io.IOException;

/**
 * Created by aniruddha on 26/8/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Physics physics = new Physics();
        try {
            System.out.println("Torque - "+physics.torque(150,30,20));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Torque - "+physics.torque(15,3,2));
        System.out.println("Accln - "+physics.acceleration(150,0));
        System.out.println("Accln - "+physics.acceleration(150,10));
    }
}
