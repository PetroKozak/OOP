package com.petro.oop;

import java.math.BigInteger;

public class BinaryConvert extends BasicConvert {
    @Override
    public String convertingProcess(long number) {
        String result = BigInteger.valueOf(number).toString(2);
        return result;
    }

}
