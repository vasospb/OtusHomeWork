package ru.otus.homework8.test;

import ru.otus.homework8.test.unit.DiceGameTest1;
import ru.otus.homework8.test.unit.DiceGameTest2;
import ru.otus.homework8.test.unit.DiceGameTest3;
import ru.otus.homework8.test.unit.DiceGameTest4;

public class DiceAllTests {

    public static void main(String[] args) {
        new DiceGameTest1().testDiceGame();
        new DiceGameTest2().testDiceGame();
        new DiceGameTest3().testDiceGame();
        new DiceGameTest4().testDiceGame();



    }
}
