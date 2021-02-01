package com.petro.maps;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class MapExercises {
    /**
     * Write a method rarest that accepts a map whose keys are strings and whose values are integers as a parameter
     * and returns the integer value that occurs the fewest times in the map. If there is a tie, return the smaller
     * integer value. If the map is empty, throw an exception.
     * <p>
     * For example, suppose the map contains mappings from students' names (strings) to their ages (integers). Your
     * method would return the least frequently occurring age. Consider a map variable m containing the following key/
     * value pairs:
     * <p>
     * {Alyssa=22, Char=25, Dan=25, Jeff=20, Kasey=20, Kim=20, Mogran=25, Ryan=25, Stef=22}
     * Three people are age 20 (Jeff, Kasey, and Kim), two people are age 22 (Alyssa and Stef), and four people are age
     * 25 (Char, Dan, Mogran, and Ryan). So a call of rarest(m) returns 22 because only two people are that age.
     * If there is a tie (two or more rarest ages that occur the same number of times), return the youngest age among
     * them. For example, if we added another pair of Kelly=22 to the map above, there would now be a tie of three people
     * of age 20 (Jeff, Kasey, Kim) and three people of age 22 (Alyssa, Kelly, Stef). So a call of rarest(m) would now
     * return 20 because 20 is the smaller of the rarest values.
     */


    void rarest(HashMap<String, Integer> map) {
        HashMap mp1 = (HashMap) map.values().stream().collect(groupingBy(Function.identity()));
        ArrayList mp1ArrayValue;
        ArrayList mp1Keys = new ArrayList();
        HashMap map2 = new HashMap();
        ArrayList<Integer> list = new ArrayList<>(mp1.keySet());

        for (int i = 0; i < mp1.size(); i++) {
            mp1ArrayValue = (ArrayList) mp1.get(list.get(i));
            map2.put(list.get(i), mp1ArrayValue.size());
        }

        int minFrequency = (Integer) Collections.min(map2.values());
        int minAge = 0;
        Iterator iter = map2.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            if (entry.getValue().equals(minFrequency)) {
                minAge = (int) entry.getKey();
            }
        }

        iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            if (entry.getValue().equals(minAge)) {
                mp1Keys.add(entry.getKey());
            }
        }

        System.out.println("The Students with least frequently occuring age are: "
                + mp1Keys.toString().replace('[', ' ').replace(']', ' ')
                + " with age: " + minAge + " and frequency: " + minFrequency);
    }

    void rarest2(HashMap<String, Integer> map) {
        HashSet<Integer> set = new HashSet(map.values());
        ArrayList<Integer> values = new ArrayList<>(map.values());
        HashMap counts = new HashMap();
        ArrayList<String> mapKeys = new ArrayList<>();
        int minAge;
        int minFrequency;

        for (int sval : set) {
            counts.put(arrayCount(values, sval), sval);
        }

        Iterator iter = map.entrySet().iterator();
        minFrequency = (int) Collections.min(counts.keySet());
        minAge = (int) counts.get(Collections.min(counts.keySet()));

        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            if ((int) entry.getValue() == minAge) {
                mapKeys.add((String) entry.getKey());
            }
        }

        System.out.println("The Students with least frequently occuring age are: "
                + mapKeys.toString().replace('[', ' ').replace(']', ' ')
                + " with age: " + minAge + " and frequency:" + minFrequency);

    }

    int arrayCount(ArrayList<Integer> ar, int item) {
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) == item) {
                count++;
            } else {
                count = count;
            }
        }
        return count;
    }
}
