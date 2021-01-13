package com.petro.oop;

import java.math.BigInteger;

enum BasicConvert {
    BINARY_CONVERT("2") {
        @Override
        public String convertingProcess(long number) {
            return BigInteger.valueOf(number).toString(2);
        }
    },
    OCTAL_CONVERT("8") {
        @Override
        public String convertingProcess(long number) {
            return BigInteger.valueOf(number).toString(8);
        }
    },
    DECIMAL_CONVERT("10") {
        @Override
        public String convertingProcess(long number) {
            return String.valueOf(number);
        }
    },
    HEXADECIMAL_CONVERT("16") {
        @Override
        public String convertingProcess(long number) {
            return BigInteger.valueOf(number).toString(16);
        }
    };

    private String system;

    public String getSystem() {
        return system;
    }

    BasicConvert(String system) {
        this.system = system;
    }

    public abstract String convertingProcess(long number);
}
