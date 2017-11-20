package ch.hslu.plab.DojoNov;

import ch.hslu.plab.CyberDojoNov.BracketsEvaluator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class BracketsTests {
    @Test
    public void checkForEasyRoundBrackets() {
        boolean expected = true;
        BracketsEvaluator evaluator = new BracketsEvaluator();
        boolean actual = evaluator.isBalanced("()");
        assertEquals(expected, actual);
    }

    @Test
    public void checkForEasyBraceBrackets() {
        boolean expected = true;
        BracketsEvaluator evaluator = new BracketsEvaluator();
        boolean actual = evaluator.isBalanced("{}");
        assertEquals(expected, actual);
    }

    @Test
    public void checkForEasyArrayBrackets() {
        boolean expected = true;
        BracketsEvaluator evaluator = new BracketsEvaluator();
        boolean actual = evaluator.isBalanced("[]");
        assertEquals(expected, actual);
    }
    @Test
    public void checkForHeavyArrayBrackets() {
        boolean expected = true;
        BracketsEvaluator evaluator = new BracketsEvaluator();
        boolean actual = evaluator.isBalanced("{()}[[{}]]");
        assertEquals(expected, actual);
    }


    @Test
    public void checkForHeavyArrayBracketsWrong() {
        boolean expected = false;
        BracketsEvaluator evaluator = new BracketsEvaluator();
        boolean actual = evaluator.isBalanced("{{)(}}");
        assertEquals(expected, actual);
    }
}
