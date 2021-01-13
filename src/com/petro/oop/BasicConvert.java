package com.petro.oop;

import java.math.BigInteger;

enum BasicConvert {
    BINARY_CONVERT {
        @Override
        public String convertingProcess(long number) {
            return BigInteger.valueOf(number).toString(2);
        }
    },
    OCTAL_CONVERT {
        @Override
        public String convertingProcess(long number) {
            return BigInteger.valueOf(number).toString(8);
        }
    },
    DECIMAL_CONVERT {
        @Override
        public String convertingProcess(long number) {
            return String.valueOf(number);
        }
    },
    HEXADECIMAL_CONVERT {
        @Override
        public String convertingProcess(long number) {
            return BigInteger.valueOf(number).toString(16);
        }
    };

    public abstract String convertingProcess(long number);
}
