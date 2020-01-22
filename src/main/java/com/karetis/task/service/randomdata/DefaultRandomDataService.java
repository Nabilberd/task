package com.karetis.task.service.randomdata;

import com.karetis.task.dataaccessobject.RandowDataRepository;
import com.karetis.task.domainobject.RandowDataDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Service
public class DefaultRandomDataService implements RandomDataService {

    private final int NUMBER_LOOP = 2000000;

    private RandowDataRepository randowDataRepository;

    @PersistenceContext
    EntityManager entityManager;

    public DefaultRandomDataService(RandowDataRepository randowDataRepository) {
        this.randowDataRepository = randowDataRepository;
    }

    @Override
    @Transactional
    public void saveRandomData() {

        randowDataRepository.deleteAll();

        for (int i = 0; i < NUMBER_LOOP; i++) {

            RandowDataDO randowDataDO = new RandowDataDO();
            randowDataDO.setRandom1(getRandomBigInteger());
            randowDataDO.setRandom2(getRandomBigInteger());
            randowDataDO.setRandom3(getRandomBigInteger());
            randowDataRepository.save(randowDataDO);

        }
    }


}
