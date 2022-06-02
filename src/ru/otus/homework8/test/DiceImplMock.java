package ru.otus.homework8.test;

import ru.otus.homework8.game.Dice;

public class DiceImplMock implements Dice {
    private int count = 0;

    @Override
    public int roll() {
        count++;
        //return 4 only for the first call
        if (count == 1) {
            return 1;
        }
        //return 2 for all other calls
        return 2;
    }
}
