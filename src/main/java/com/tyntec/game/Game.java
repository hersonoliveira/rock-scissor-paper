package com.tyntec.game;

import com.tyntec.game.model.Hand;
import com.tyntec.game.model.Player;

public class Game {

    public static void main(String[] args) {
        //Setup
        int numRounds = 100;
        int tie = 0;
        int scoreA = 0;
        int scoreB = 0;
        Player playerA = new Player("Player A");
        Player playerB = new Player("Player B");

        for (int i = 0; i < numRounds ; i++) {
            playerA.setHand(Hand.PAPER);
            playerB.setHand(Hand.randomHand());

            if (playerA.getHand().resultAgainst(playerB.getHand())==0) tie++;
            if (playerA.getHand().resultAgainst(playerB.getHand())==1) scoreA++;
            if (playerA.getHand().resultAgainst(playerB.getHand())==-1) scoreB++;
        }

        System.out.println(String.format("%s wins %d of %d games", playerA.getName(), scoreA, numRounds));
        System.out.println(String.format("%s wins %d of %d games", playerB.getName(), scoreB, numRounds));
        System.out.println(String.format("Tie: %d of %d games", tie, numRounds));
    }
}
