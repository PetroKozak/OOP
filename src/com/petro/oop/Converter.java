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

        switch (convertSystem) {
            case ("2"):
                convert = BasicConvert.BINARY_CONVERT;
                result(convertSystem, wishedNumber, convert);
                break;
            case ("8"):
                convert = BasicConvert.OCTAL_CONVERT;
                result(convertSystem, wishedNumber, convert);
                break;
            case ("10"):
                convert = BasicConvert.DECIMAL_CONVERT;
                result(convertSystem, wishedNumber, convert);
                break;
            case ("16"):
                convert = BasicConvert.HEXADECIMAL_CONVERT;
                result(convertSystem, wishedNumber, convert);
                break;
            default:
                System.out.println("You've set wrong converting system");
        }

    }


}
