package ru.otus.homework8;

import ru.otus.homework8.game.*;

public class Demo {

    public static void main(String[] args) {
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(new Player("Игорь"), new Player("Игорь"));
    }
}
