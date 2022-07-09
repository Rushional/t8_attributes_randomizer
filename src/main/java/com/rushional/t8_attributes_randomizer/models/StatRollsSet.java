package com.rushional.t8_attributes_randomizer.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StatRollsSet {
    @Getter
    private final List<StatRoll> rollsList;

    public StatRollsSet() {
        rollsList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            rollsList.add(new StatRoll());
        }
        rollsList.sort(Comparator.comparing(StatRoll::getResultValue));
    }

}
