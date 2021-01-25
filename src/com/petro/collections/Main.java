package com.petro.collections;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Exercises ex = new Exercises();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add("123");
        list.add("1234");
        list.add("Hello");
        list.add("Done");
        list.add("fifth");
        list.add("fifth");


        list2.add(5555);
        list2.add(555);
        list2.add(65);
        list2.add(0);
        list2.add(435);
        list2.add(0);
        list2.add(0);
        list2.add(12);

        ex.removeEvenLength(list);
        ex.doubleList(list);
        ex.doubleList2(list);
        ex.minToFront(list2);
        ex.swapPairs(list);
        ex.removeDuplicates(list);
        ex.removeInRange(list2,3,6,0);
        ex.stutter(list,4);
    }
}
