package ru.otus.homework8.game;

public class Game {

    private final Dice dice;
    private final GameWinnerPrinter winnerPrinter;

    public Game(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        if ( winnerPrinter == null){
            throw new NullPointerException("winner printer cannot be null");
        }else{
            this.winnerPrinter = winnerPrinter;
        }
    }

    public void playGame(Player player1, Player player2) {
        int player1Result = dice.roll();
        int player2Result = dice.roll();

//        if (player1Result == player2Result){
//            winnerPrinter.printWinner(null);
//        } else {
//            Player winner = (player1Result > player2Result) ? player1 : player2;
//            winnerPrinter.printWinner(winner);
//        }
        Player winner = (player1Result > player2Result) ? player1 : player2;
        winnerPrinter.printWinner(winner);
    }
}
