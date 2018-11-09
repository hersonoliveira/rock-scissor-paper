package com.tyntec.game.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Hand {
    SCISSORS, PAPER, ROCK;

    private Hand win;
    private static final List<Hand> HANDS = Collections.unmodifiableList(Arrays.asList(Hand.values()));
    private static final int SIZE = HANDS.size();
    private static final Random RANDOM = new Random();

    static {
        SCISSORS.win = PAPER;
        PAPER.win = ROCK;
        ROCK.win = SCISSORS;
    }

    public int resultAgainst(Hand hand) {
        if (this.equals(hand)) return 0;
        if (win.equals(hand)) return 1;
        return -1;
    }

    public static Hand randomHand() {
        return HANDS.get(RANDOM.nextInt(SIZE));
    }
}
