package com.sda.ionelavasile.advanced.coding.collections.ex5;

/**
 * Create a Storage class that will have a private Map field, a public constructor,and methods:
 * addToStorage(String key, String value) → adding elements to the storage
 * printValues(String key)→ displaying all elements under a given key
 * findValues(String value)→ displaying all keys that have a given value
 * The Storage class should allow you to store multiple values under one key.
 */

public class Main {
    public static void main(String[] args) {
        Storage students = new Storage();

        students.addToStorage("RO45", "Andrei");
        students.addToStorage("RO45", "Alex");
        students.addToStorage("RO45", "Larisa");
        students.addToStorage("RO45", "Dumitru");
        students.addToStorage("RO46", "Ionela");
        students.addToStorage("RO46", "Bogdan");
        students.addToStorage("RO46", "Elena");

        students.printValues("RO45");
        students.printValues("RO46");
        students.printValues("RO47");

        System.out.println(students.findKeys("Andrei"));
        System.out.println(students.findKeys("Ion"));
        System.out.println(students.findKeys("Bogdan"));

    }

}
