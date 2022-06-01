package ru.otus.homework8.test.unit;

import ru.otus.assertions.Assertions;
import ru.otus.homework8.game.Game;
import ru.otus.homework8.game.Player;
import ru.otus.homework8.test.DiceImplStub;
import ru.otus.homework8.test.GameWinnerConsolePrinterStub;

public class DiceGameTest3 {
    public void testDiceGame() {
        String scenario = "Тест на равенство выпадения";
        try {
            GameWinnerConsolePrinterStub printer = new GameWinnerConsolePrinterStub();
            Game game = new Game(new DiceImplStub(), printer);
            Player p1 = new Player("Игорь");
            Player p2 = new Player("Вася");
            game.playGame(p1, p2);
            Assertions.assertEquals("Ничья", printer.getWinner());
            System.out.println(scenario + " пройден");

        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
