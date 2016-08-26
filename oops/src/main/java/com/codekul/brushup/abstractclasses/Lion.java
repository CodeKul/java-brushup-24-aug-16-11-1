package com.codekul.brushup.abstractclasses;

/**
 * Created by aniruddha on 26/8/16.
 */
public /*abstract*/  class Lion extends Animal {

    public void roar(){
        System.out.println("Lion roaring");
    }

    @Override
    public void walk() {
        System.out.println("Lion Walking");
    }

    @Override
    public void eat() {
        System.out.println("Lion Eating");
    }
}
