package ru.otus.homework8.test.unit;

import ru.otus.assertions.Assertions;
import ru.otus.homework8.game.Game;
import ru.otus.homework8.game.Player;
import ru.otus.homework8.test.DiceImplSpy;
import ru.otus.homework8.test.GameWinnerConsolePrinterStub;

public class DiceGameTest4 {
    public void testDiceGame() {
        String scenario = "Тест на победу первого игрока";
        try {
            GameWinnerConsolePrinterStub winnerPrinter = new GameWinnerConsolePrinterStub();
            Game game = new Game(new DiceImplSpy(), winnerPrinter);
            Player p1 = new Player("Игорь");
            Player p2 = new Player("Вася");
            game.playGame(p1, p2);
            Assertions.assertEquals("Победитель: Игорь", winnerPrinter.getWinner());
            System.out.println(scenario + " пройден");

        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
