package ru.otus.homework8.game;

public class GameWinnerConsolePrinter implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        System.out.printf("Победитель: %s", winner.getName());
    }
}
