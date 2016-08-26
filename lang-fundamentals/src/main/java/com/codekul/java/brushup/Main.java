package com.codekul.java.brushup;

/**
 * Created by aniruddha on 25/8/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World .. Gradle ...");

        int i = 10;
        if(i == 10)
            System.out.println("true");
        else
            System.out.println("False");

        if(i < 10){
            if(i > 1 && i < 5){
                System.out.println("Nesting");
            }
            else {
                System.out.println("Again Nesting");
            }
        }

        String []coutries = new String[10];

        String []cities = {"Pune","Mumbai"};

        for(int index = 0; index < cities.length ;index++)
            System.out.println("City is - "+cities[index]);

        for (String city: cities)
            System.out.println("Foreach - "+city);
    }
}
