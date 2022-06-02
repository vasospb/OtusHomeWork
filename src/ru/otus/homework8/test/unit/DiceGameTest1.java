package ru.otus.homework8.test.unit;

import ru.otus.assertions.Assertions;
import ru.otus.homework8.game.DiceImpl;

public class DiceGameTest1 {
    public void testDiceGame() {
        String scenario = "Тест на превышение";
        try {
            int diceNumber = new DiceImpl().roll();
            boolean outOfDiceNumbers = (diceNumber >= 1 && diceNumber <= 6);
            for (int i = 0; i < 10; i++) {
                Assertions.assertTrue(outOfDiceNumbers, "На кубике выпало " + diceNumber);
            }
            System.out.print(scenario + " пройден.");
            System.out.println("Выпал " + diceNumber);

        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
