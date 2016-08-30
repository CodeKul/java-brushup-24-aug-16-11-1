package com.codekul.brushup.collections;

import sun.rmi.runtime.Log;

import java.util.*;

/**
 * Created by aniruddha on 30/8/16.
 */
public class MyCollection {

    public void basics(){

        Collection<String> collection = new ArrayList<>();
        collection.add("India");
        collection.add("China");
        collection.add("Japan");
        collection.add("Shri Lanka");

        for (String s : collection) {
            System.out.println("Country is - "+s);
        }

        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println("Country - "+s);
        }
    }

    public void list(){

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(6);
        list.add(6);
        list.add(null);

        int pos3 = list.get(2);
        list.add(1,90);

        list.remove(list.size()-1);

        for (Integer integer : list) {
            System.out.println("Int is "+integer);
        }
    }

    public void set(){

        Set<String> set = new TreeSet<>();
        set.add("Android");
       // set.add(null);
        set.add("Apple");
        set.add("Rim");
        //set.add(null);
        set.add("Windows");
        set.add("Symbian");
        set.add("Symbian");

        for (String s : set) {
            System.out.println("Set "+s);
        }
    }

    public void map(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Android");
        map.put(2,"Apple");
        map.put(3,"Windows");
        map.put(4,"Symbian");
        map.put(5,"Rim");

        Set<Integer> keys = map.keySet();

        Collection<String> values = map.values();
    }
}

