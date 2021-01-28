package com.petro.maps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MapExercises mex = new MapExercises();
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alyssa", 22);
        map.put("Char", 25);
        map.put("Jeff", 20);
        map.put("Kim", 20);
        map.put("fff", 20);
        map.put("Morgan", 25);
        map.put("Ryan", 25);
        map.put("Dan", 25);
        map.put("Stef", 22);

        mex.rarest(map);
    }
}
