package com.karetis.task.service.randomdata;

import com.karetis.task.dataaccessobject.RandowDataRepository;
import com.karetis.task.domainobject.RandowDataDO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.Random;

public class RandomDataService {

    final int NUMBER_LOOP = 2000000;
    final static BigInteger MAX = new BigInteger("2000000000000");
    final static BigInteger MIN = new BigInteger("1000000000");
    Random rand = new Random();

    private RandowDataRepository randowDataRepository;

    public RandomDataService(RandowDataRepository randowDataRepository) {
        this.randowDataRepository = randowDataRepository;
    }

    @PersistenceContext
    EntityManager entityManager;

    public BigInteger getRandomBigInteger() {
        BigInteger bigInteger1 = MAX.subtract(MIN);
        int maxNumBitLength = bigInteger1.bitLength();
        BigInteger result = new BigInteger(maxNumBitLength, rand);
        return result;
    }

    public String saveRandomData(){

        randowDataRepository.deleteAll();

        for (int i = 0; i < NUMBER_LOOP; i++) {

            RandowDataDO randowDataDO = new RandowDataDO();
            randowDataDO.setRandom1(getRandomBigInteger());
            randowDataDO.setRandom2(getRandomBigInteger());
            randowDataDO.setRandom3(getRandomBigInteger());
            randowDataRepository.save(randowDataDO);

            if (i%2000 ==0){
                entityManager.flush();
                entityManager.clear();
            }

        }

        return "Data bien persistées";

    }
}
