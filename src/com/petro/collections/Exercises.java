package com.petro.collections;

import java.util.*;
import java.util.stream.IntStream;

public class Exercises {

    /**
     * Task1. Write a method removeEvenLength that takes an ArrayList
     * of Strings as a parameter and that removes all of the strings of even length from the list.
     */

    void removeEvenLength(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            result.add(i, list.get(i));
        }
        Iterator iter = result.iterator();

        while (iter.hasNext()) {
            if (iter.next().toString().toCharArray().length % 2 == 0) {
                iter.remove();
            }
        }
        System.out.println(result);
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
     * Solution 2
     */
    void doubleList2(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();

        for (String str : list) {
            result.add(list.get(list.indexOf(str)));
        }

        for (int i = 0; i < result.size(); i = i + 2) {
            result.add(i, result.get(i));
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

    void minToFront(ArrayList<Integer> list) throws NoSuchElementException {
        ArrayList<Integer> result = new ArrayList<>();

        for (int in : list) {
            result.add(list.get(list.indexOf(in)));
        }

        try {
            int min = Collections.min(list);
            result.remove(result.indexOf(min));
            result.add(0);

            for (int i = result.size() - 1; i > 0; i--) {
                result.set(i, result.get(i - 1));
            }

            result.set(0, min);

            for (int i = 1; i < result.size(); i++) {
                if (result.get(i) == result.get(0)) {
                    result.add(0, result.get(i));
                    result.remove(i + 1);
                }
            }

            System.out.println(result);
        } catch (NoSuchElementException nsee) {
            System.out.println("List is empty");
        }

    }

    /**
     * Write a method swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion.
     * Your method should switch the order of the first two values, then switch the order of the next two, switch
     * the order of the next two, and so on. For example, if the list initially stores these values: {"four", "score",
     * "and", "seven", "years", "ago"} your method should switch the first pair, "four", "score", the second pair,
     * "and", "seven", and the third pair, "years", "ago", to yield this list: {"score", "four", "seven", "and", "ago", "years"}
     * <p>
     * If there are an odd number of values in the list, the final element is not moved. For example, if the original list had been:
     * {"to", "be", "or", "not", "to", "be", "hamlet"} It would again switch pairs of values, but the final value, "hamlet" would not
     * be moved, yielding this list: {"be", "to", "not", "or", "be", "to", "hamlet"}
     */

    void swapPairs(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        String temp3;

        for (String str : list) {
            result.add(list.get(list.indexOf(str)));
        }
        if (result.size() % 2 == 0) {
            swap(result);
        } else {
            temp3 = result.get(list.size() - 1);
            result.remove(list.size() - 1);
            swap(result);
            result.add(result.size(), temp3);

        }
        System.out.println(result);
    }

    private void swap(ArrayList<String> list) {
        String temp1;
        String temp2;

        for (int i = 0; i <= list.size() - 1; i = i + 2) {
            temp1 = list.get(i);
            temp2 = list.get(i + 1);

            list.add(i, temp2);
            list.add(i + 1, temp1);

            list.remove(i + 3);
            list.remove(i + 2);
        }
    }

    /**
     * Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings and that eliminates
     * any duplicates from the list. For example, suppose that a variable called list contains the following values:
     * {"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"} After calling removeDuplicates(list);
     * the list should store the following values: {"be", "is", "not", "or", "question", "that", "the", "to"}
     */

    void removeDuplicates(ArrayList<String> list) {
        HashSet<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        System.out.println(list);
    }

    /**
     * Write a method called removeInRange that accepts four parameters: an ArrayList of integers,an element value, a
     * starting index, and an ending index. The method's behavior is to remove all occurrences of the given element that
     * appear in the list between the starting index (inclusive) and the ending index (exclusive). Other values and
     * occurrences of the given value that appear outside the given index range are not affected.
     * <p>
     * For example, for the list [0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16], a call of removeInRange(list, 0, 5, 13);
     * should produce the list [0, 0, 2, 0, 4, 6, 8, 10, 12, 0, 14, 0, 16]. Notice that the zeros located at indices between 5
     * inclusive and 13 exclusive in the original list (before any modifications were made) have been removed.
     */

    void removeInRange(ArrayList<Integer> list, int start, int end, int value) {
        ArrayList<Integer> sublist = new ArrayList<>();
        Iterator it= IntStream.range(start,end).iterator();

        while(it.hasNext()){
            sublist.add(list.get((Integer) it.next()));
        }
        list.removeAll(sublist);

        ListIterator listIterator = sublist.listIterator(sublist.size());

        while(listIterator.hasPrevious()){
            if (listIterator.previous().equals(value) ) {
                listIterator.remove();
            }
        }
        list.addAll(start, sublist);
        System.out.println(list);
    }

    /**
     * Write a method stutter that takes an ArrayList of Strings and an integer k as parameters and that replaces every
     * string with k copies of that string. For example, if the list stores the values ["how", "are", "you?"] before the method
     * is called and k is 4, it should store the values ["how", "how", "how", "how", "are", "are", "are", "are", "you?", "you?", "you?",
     * "you?"] after the method finishes executing. If k is 0 or negative, the list should be empty after the call.
     */

    void stutter(ArrayList<String> list, int k) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < k; j++) {
                String temp = list.get(i);
                result.add(temp);
            }
        }
        System.out.println(result);
    }
}
