package com.rushional.t8_attributes_randomizer.models;

import com.rushional.t8_attributes_randomizer.services.RollD6;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class StatRoll {
    private final Integer resultValue;
    private final List<Integer> rolls;

    public StatRoll() {
        rolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rolls.add(RollD6.call());
        }
        rolls.sort(Collections.reverseOrder()); //descending order, so the smallest is the last one
        resultValue = rolls.get(0) + rolls.get(1) + rolls.get(2);
    }

    public String toString() {
        return resultValue + " (" + rolls.get(0) + " + " + rolls.get(1) + " + " + rolls.get(2) + " & " + rolls.get(3) + ')';
    }
}
