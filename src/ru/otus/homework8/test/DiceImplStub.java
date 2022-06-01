package ru.otus.homework8.test;

import ru.otus.homework8.game.Dice;

public class DiceImplStub implements Dice {
    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        //return new Random().nextInt();
        return 2;
    }
}
