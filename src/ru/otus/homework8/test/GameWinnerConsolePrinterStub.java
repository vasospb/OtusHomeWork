package ru.otus.homework8.test;

import ru.otus.homework8.game.GameWinnerPrinter;
import ru.otus.homework8.game.Player;

public class GameWinnerConsolePrinterStub implements GameWinnerPrinter {
    String winner;
    @Override
    public void printWinner(Player winner) {
        if (winner == null){
            this.winner = "Ничья";
        } else {
            this.winner = String.format("Победитель: %s", winner.getName());
        }
    }

    public String getWinner() {
        return winner;
    }
}
