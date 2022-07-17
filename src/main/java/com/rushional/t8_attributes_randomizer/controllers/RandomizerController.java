package com.rushional.t8_attributes_randomizer.controllers;

import com.rushional.t8_attributes_randomizer.models.StatRollsSet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandomizerController {

    @GetMapping("/randomizer")
    public String randomizer(Model model) {
        model.addAttribute("statRollsList", new StatRollsSet().getRollsList());
        return "randomizer";
    }
}
