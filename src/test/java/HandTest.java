import com.tyntec.game.model.Hand;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HandTest {

    private Hand hand;

    @Test
    public void winAgainstTest() {
        hand = Hand.PAPER;
        assertTrue(hand.winAgainst(Hand.ROCK));

        hand = Hand.SCISSORS;
        assertTrue(hand.winAgainst(Hand.PAPER));

        hand = Hand.ROCK;
        assertTrue(hand.winAgainst(Hand.SCISSORS));
    }
}
