package com.rushional.t8_attributes_randomizer.services;

import java.util.Random;

public class RollD6 {

    public static int call() {
        Random r = new Random();
        return r.nextInt(6) + 1; //random int 0-5 + 1 => 1-6
    }
}
