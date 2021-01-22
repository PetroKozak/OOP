package com.petro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exercises {

    /**
     * Task1. Write a method removeEvenLength that takes an ArrayList
     * of Strings as a parameter and that removes all of the strings of even length from the list.
     */

    void removeEvenLength(ArrayList<String> list) {
        Iterator iter = list.iterator();

        while (iter.hasNext()) {
            if (iter.next().toString().toCharArray().length % 2 == 0) {
                iter.remove();
            }
        }
        System.out.println(list);
    }

    /**
     * Task 2
     * Write a method doubleList that takes an ArrayList of Strings as a parameter and that replaces every string with two of that string.
     * For example, if the list stores the values {"how", "are", "you?"} before the method is called,
     * it should store the values {"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.
     */

    void doubleList(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 2; j++) {
                String temp = list.get(i);
                result.add(temp);
            }
        }
        System.out.println(result);
    }

    /**
     * Task 3
     * Write a method minToFront that takes an ArrayList of integers as a parameter and that moves the minimum value
     * in the list to the front, otherwise preserving the order of the elements. For example, if a variable called list
     * stores the following values: {3, 8, 92, 4, 2, 17, 9} and you make this call: minToFront(list); it should store the
     * following values after the call: {2, 3, 8, 92, 4, 17, 9} You may assume that the list stores at least one value.
     */

    void minToFront(ArrayList<Integer> list) {
        int min = Collections.min(list);

        list.remove(list.indexOf(min));
        list.add(0);

        for (int i = list.size() - 1; i > 0; i--) {
            list.set(i, list.get(i - 1));
        }

        list.set(0, min);

        System.out.println(list);
    }


}
