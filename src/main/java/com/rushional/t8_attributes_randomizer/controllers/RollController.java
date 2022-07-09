package com.rushional.t8_attributes_randomizer.controllers;

import com.rushional.t8_attributes_randomizer.services.RollStats;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RollController {

    @PostMapping("/reroll")
    public String getStatsRoll() {
        return RollStats.call();
    }
}
