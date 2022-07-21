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

    public String toString() {
        StringBuilder outputBuilder = new StringBuilder();
        rollsList.forEach(roll -> outputBuilder.append(roll.toString()).append(' '));
//        Kinda bothers me that there would be an empty space at the end for no reason, but like...
//        This is inherently a bad way of doing it, I'm doing it to learn,
//        later will use JSON in these cases anyway, so whatever
        return outputBuilder.toString();
    }
}
