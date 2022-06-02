package ru.otus.homework8.game;

import java.util.Random;

public class DiceImpl implements Dice {
    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        //return new Random().nextInt();
        return new Random().nextInt(6) + 1;
    }
}
