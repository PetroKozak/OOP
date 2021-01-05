package com.petro.oop;

import java.math.BigInteger;

public class HexadecimalConvert extends BasicConvert{
    @Override
    public String convertingProcess(long number) {
        String result = BigInteger.valueOf(number).toString(16);
        return result;
    }

}
