package com.karetis.task.service.randomdata;

import java.math.BigInteger;
import java.util.Random;

public interface RandomDataService {

    default BigInteger getRandomBigInteger() {
        BigInteger bigInteger = new BigInteger("2000000000000");
        BigInteger min = new BigInteger("1000000000");
        BigInteger bigInteger1 = bigInteger.subtract(min);
        int maxNumBitLength = bigInteger1.bitLength();
        Random rand = new Random();
        BigInteger result = new BigInteger(maxNumBitLength, rand);
        return result;
    }

    void saveRandomData();
}
