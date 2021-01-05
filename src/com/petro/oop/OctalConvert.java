package com.petro.oop;

import java.math.BigInteger;

public class OctalConvert extends BasicConvert{
    @Override
    public String convertingProcess(long number) {
        String result = BigInteger.valueOf(number).toString(8);
        return result;
    }

}
