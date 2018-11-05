package com.tyntec.game.model;

public class Match {

    private static int scorePlayer1=0;
    private static int scorePlayer2=0;
    private static int tie=0;

    public static void play(Player player1, Player player2, int rounds) {
        for (int i = 0; i < rounds; i++) {
            if(player1.getHand().equals(player2.getHand())) {
                tie++;
            } else if(player1.getHand().winAgainst(player2.getHand())) {
                scorePlayer1++;
            } else {
                scorePlayer2++;
            }
        }
        printResult(player1,scorePlayer1,rounds);
        printResult(player2,scorePlayer2,rounds);
        System.out.println(String.format("Tie: %d of %d games", tie, rounds));
    }

    private static void printResult(Player player, int score, int rounds) {
        System.out.println(String.format("%s wins %d of %d games", player.getName(), score, rounds));
    }
}
