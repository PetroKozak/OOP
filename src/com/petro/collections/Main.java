package com.petro.collections;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Exercises ex = new Exercises();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add("1234");
        list.add("123");
        list.add("Hello");
        list.add("Done");

        list2.add(5555);
        list2.add(555);
        list2.add(65);
        list2.add(435);

        ex.removeEvenLength(list);
        ex.doubleList(list);
        ex.minToFront(list2);


    }
}
