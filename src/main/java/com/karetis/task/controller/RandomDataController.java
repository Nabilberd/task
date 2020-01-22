package com.karetis.task.controller;

import com.karetis.task.service.randomdata.RandomDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomDataController {

    private final RandomDataService randomDataService;

    @Autowired
    public RandomDataController(RandomDataService randomDataService) {
        this.randomDataService = randomDataService;
    }

    @GetMapping("/randomData")
    public void home() {
        randomDataService.saveRandomData();
    }

}
