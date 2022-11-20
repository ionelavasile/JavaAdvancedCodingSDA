package com.sda.ionelavasile.advanced.coding.collection.ex7;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Create a method that accepts TreeMap and prints the first and last Entry in the console.
 */

public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        treeMap.put("BMW", "X6");
        treeMap.put("Ford", "Focus");
        treeMap.put("Renault", "Megane");
        treeMap.put("Dacia", "Logan");
        printFirstAndLastEntry(treeMap);

    }
    //tree map va ramane intotdeauna sortat

    public static void printFirstAndLastEntry(TreeMap<String, String> input) {

        System.out.println("First entry : " + input.firstEntry());
        System.out.println("Last entry : " + input.lastEntry());


    }


}
