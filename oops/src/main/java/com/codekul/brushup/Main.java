package com.codekul.brushup;

import com.codekul.brushup.abstractclasses.Animal;
import com.codekul.brushup.abstractclasses.Lion;
import com.codekul.brushup.innerclasses.Outer;
import com.codekul.brushup.interfaces.Bike;
import com.codekul.brushup.interfaces.GpsListener;
import com.codekul.brushup.interfaces.Human;

/**
 * Created by aniruddha on 26/8/16.
 */
public class Main {

    public static void main(String[] args) {
        abstractClass();
    }

    private static void abstractClass(){
        Animal animal = new Lion();
        animal.walk();
        animal.eat();

        Lion lion = new Lion();
        lion.roar();
    }

    private static void oops(){
        Car car = new Car(); // object
        car.increaseSpeed(); // method calling
        car.increaseSpeed(100); // polymorphism -> runtime binding -> late binding
        car.applyBreaks();

        Mercedez mercedez =
                new Mercedez();
        mercedez.enableCruzeControl(); // own
        mercedez.increaseSpeed(500); // inherited
        mercedez.applyBreaks(); // inherited

        //Mercedez mercedezCar = new Car();
    }
    private static void interfaces(){

        GpsListener listenerBike = new Bike();

        GpsListener listenerHuman = new Human();

        Bike bike = new Bike();
        bike.speedUp();
        System.out.println("Bike Location "+bike.location());;

        Human human =new Human();
        human.walk();
        System.out.println("Human Location "+human.location());
    }

    private static void innerClasses(){

        Outer outer = new Outer();
        outer.setOuterInt(10);

        Outer outerAny = new Outer();
        outerAny.setOuterInt(20);

        Outer.SimpleInner simpleInner = outerAny.new SimpleInner(); // depends on outer instance

        Outer.StaticInner staticInner = new Outer.StaticInner(); // depends on outer class

        GpsListener listenerHuman = new Human(); //named

        GpsListener listener = new GpsListener() {
            //anonymus inner class
            @Override
            public String location() {
                return null;
            }
        };
    }
}
