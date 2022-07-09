package com.rushional.t8_attributes_randomizer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandomizerController {

    @GetMapping("/randomizer")
    public String randomizer() {
        return "randomizer";
    }
}
