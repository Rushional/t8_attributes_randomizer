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
        for (int i = 0; i < 5; i++) {
            outputBuilder.append(rollsList.get(i).toString())
                    .append("\\n");
        }
        outputBuilder.append(rollsList.get(5).toString());
        System.out.println(outputBuilder.toString());
        return outputBuilder.toString();
    }
}
