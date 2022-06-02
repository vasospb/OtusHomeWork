package ru.otus.homework8.test.unit;

import ru.otus.assertions.Assertions;
import ru.otus.homework8.game.DiceImpl;
import ru.otus.homework8.game.Game;
import ru.otus.homework8.game.GameWinnerConsolePrinter;
import ru.otus.homework8.game.Player;

public class DiceGameTest2 {
    public void testDiceGame() {
        String scenario = "Тест на равенство имен";
        try {
            Game game = new Game(new DiceImpl(), new GameWinnerConsolePrinter());
            Player p1 = new Player("Игорь");
            Player p2 = new Player("Игорь");
            Assertions.assertEquals(p1.toString(), p2.toString());
            System.out.println(scenario  + " пройден.");

        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
