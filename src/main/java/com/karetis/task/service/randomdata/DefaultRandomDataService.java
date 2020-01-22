package com.karetis.task.service.randomdata;

import com.karetis.task.dataaccessobject.RandowDataRepository;
import org.springframework.stereotype.Service;


@Service
public class DefaultRandomDataService extends RandomDataService {


    public DefaultRandomDataService(RandowDataRepository randowDataRepository) {
        super(randowDataRepository);
    }

    @Override
    public String saveRandomData() {
        return super.saveRandomData();
    }

}
