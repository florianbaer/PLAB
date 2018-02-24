package ch.hslu.plab.DojoNov;

import ch.hslu.plab.CyberDojoNov.BracketsEvaluator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    public void TEstpipapoo() {
        List<Long> longList = new ArrayList<>();
        longList.add(234234L);

        List<Long> longList2 = Collections.unmodifiableList(new ArrayList<>());

        List<List<Long>> longlongList = Arrays.asList(longList, longList2);

        for (List<Long> myList : longlongList){
            myList.add(23L);
        }
     }

    @Test
    public void checkForHeavyArrayBracketsWrong() {
        boolean expected = false;
        BracketsEvaluator evaluator = new BracketsEvaluator();
        boolean actual = evaluator.isBalanced("{{)(}}");
        assertEquals(expected, actual);
    }
}
