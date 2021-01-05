package com.petro.oop;

import java.util.HashMap;
import java.util.Scanner;

public class Converter {
    public void convert() {
        HashMap<Integer, BasicConvert> systems = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        systems.put(2, new BinaryConvert());
        systems.put(8, new OctalConvert());
        systems.put(10, new DecimalConvert());
        systems.put(16, new HexadecimalConvert());

        System.out.println("Please enter Converting system:");
        int convertSystem = sc.nextInt();
        System.out.println("Please enter number to convert:");
        long wishedNumber = sc.nextLong();

        if (systems.containsKey(convertSystem)) {
            System.out.println("Your convert system is" + " " + convertSystem);
            System.out.println("Your wished number is" + " " + wishedNumber);
            System.out.print("Your result is: ");
            System.out.println(systems.get(convertSystem).convertingProcess(wishedNumber));
        } else {
            System.out.println("You set wrong convert System, please try again");
        }

    }


}
