package ru.otus.homework8.test.unit;

import ru.otus.assertions.Assertions;
import ru.otus.homework8.game.Game;
import ru.otus.homework8.game.Player;
import ru.otus.homework8.test.DiceImplMock;
import ru.otus.homework8.test.GameWinnerConsolePrinterStub;

public class DiceGameTest5 {
    public void testDiceGame() {
        String scenario = "Тест на Null Pointer";
        try {
            GameWinnerConsolePrinterStub winnerPrinter = new GameWinnerConsolePrinterStub();
            Game game = new Game(new DiceImplMock(), null);
            Player p1 = new Player("Игорь");
            Player p2 = new Player("Вася");
            game.playGame(p1, p2);
            Assertions.assertEquals("Победитель: Игорь", winnerPrinter.getWinner());
            System.out.println(scenario + " пройден");

        } catch (NullPointerException e) {
            Assertions.assertEquals("winner printer cannot be null", e.getMessage());
            System.out.println(scenario + " пройден");
        }
    }
}
