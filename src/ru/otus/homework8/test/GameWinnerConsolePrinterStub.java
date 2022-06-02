package ru.otus.homework8.test;

import ru.otus.homework8.game.GameWinnerPrinter;
import ru.otus.homework8.game.Player;

public class GameWinnerConsolePrinterStub implements GameWinnerPrinter {
    Player winner;

    @Override
    public void printWinner(Player winner) {
        this.winner = winner;
    }

    public Player getWinner() {
        return winner;
    }
}
