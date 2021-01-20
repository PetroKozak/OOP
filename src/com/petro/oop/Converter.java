package com.petro.oop;

import java.util.Scanner;

public class Converter {
    void result(String system, long number, BasicConvert base) {
        System.out.println("Your convert system is" + " " + system);
        System.out.println("Your wished number is" + " " + number);
        System.out.print("Your result is: ");
        System.out.println(base.convertingProcess(number));
    }

    public void convert() {
        BasicConvert convert;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Converting system:");
        String convertSystem = sc.nextLine();
        System.out.println("Please enter number to convert:");
        long wishedNumber = sc.nextLong();
        sc.close();

        if (convertSystem.equalsIgnoreCase(BasicConvert.BINARY_CONVERT.getSystem())) {
            convert = BasicConvert.BINARY_CONVERT;
            result(convertSystem, wishedNumber, convert);
        } else if (convertSystem.equalsIgnoreCase(BasicConvert.OCTAL_CONVERT.getSystem())) {
            convert = BasicConvert.OCTAL_CONVERT;
            result(convertSystem, wishedNumber, convert);
        } else if (convertSystem.equalsIgnoreCase(BasicConvert.DECIMAL_CONVERT.getSystem())) {
            convert = BasicConvert.DECIMAL_CONVERT;
            result(convertSystem, wishedNumber, convert);
        } else if (convertSystem.equalsIgnoreCase(BasicConvert.HEXADECIMAL_CONVERT.getSystem())) {
            convert = BasicConvert.HEXADECIMAL_CONVERT;
            result(convertSystem, wishedNumber, convert);
        } else {
            System.out.println("You've set wrong converting system");
        }
    }


}
