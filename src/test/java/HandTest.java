import com.tyntec.game.model.Hand;
import org.junit.Assert;
import org.junit.Test;

public class HandTest {

    private Hand hand1;
    private Hand hand2;

    @Test
    public void testPaperBeatsRock() {
        hand1 = Hand.PAPER;
        hand2 = Hand.ROCK;
        Assert.assertEquals(1, hand1.resultAgainst(hand2));
    }

    @Test
    public void testPaperTiesPaper() {
        hand1 = Hand.PAPER;
        hand2 = Hand.PAPER;
        Assert.assertEquals(0, hand1.resultAgainst(hand2));
    }

    @Test
    public void testPaperLosesScissors() {
        hand1 = Hand.PAPER;
        hand2 = Hand.SCISSORS;
        Assert.assertEquals(-1, hand1.resultAgainst(hand2));
    }

    @Test
    public void testRockBeatsScissors() {
        hand1 = Hand.ROCK;
        hand2 = Hand.SCISSORS;
        Assert.assertEquals(1, hand1.resultAgainst(hand2));
    }

    @Test
    public void testRockTiesRock() {
        hand1 = Hand.ROCK;
        hand2 = Hand.ROCK;
        Assert.assertEquals(0, hand1.resultAgainst(hand2));
    }

    @Test
    public void testRockLosesPaper() {
        hand1 = Hand.ROCK;
        hand2 = Hand.PAPER;
        Assert.assertEquals(-1, hand1.resultAgainst(hand2));
    }

    @Test
    public void testScissorsBeatsPaper() {
        hand1 = Hand.SCISSORS;
        hand2 = Hand.PAPER;
        Assert.assertEquals(1, hand1.resultAgainst(hand2));
    }

    @Test
    public void testScissorsTiesScissors() {
        hand1 = Hand.SCISSORS;
        hand2 = Hand.SCISSORS;
        Assert.assertEquals(0, hand1.resultAgainst(hand2));
    }

    @Test
    public void testScissorsLosesRock() {
        hand1 = Hand.SCISSORS;
        hand2 = Hand.ROCK;
        Assert.assertEquals(-1, hand1.resultAgainst(hand2));
    }
}
