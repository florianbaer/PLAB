package ch.hslu.plab.sw03.refactoring.v2;

import ch.hslu.plab.sw03.refactoring.v1.ChTaxAlgorithm;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChTaxAlgorithmTests {
    @Test
    public void SmallIncomeTest()
    {
        // arrange
        ChTaxAlgorithm algorithm = new ChTaxAlgorithm();
        // act
        double actualTaxValue = algorithm.getTaxAlgorithm(50);
        // assert
        assertEquals((50.0 - 10) / 15,actualTaxValue);
    }

    @Test
    public void BigIncomeTest()
    {
        // arrange
        ChTaxAlgorithm algorithm = new ChTaxAlgorithm();
        // act
        double actualTaxValue = algorithm.getTaxAlgorithm(50000);
        // assert
        assertEquals((50000.0 - 10) / 15,actualTaxValue);
    }

    @Test
    public void DecimalIncomeTest()
    {// arrange
        ChTaxAlgorithm algorithm = new ChTaxAlgorithm();
        // act
        double actualTaxValue = algorithm.getTaxAlgorithm(50.167);
        // assert
        assertEquals((50.167 - 10) / 15,actualTaxValue);
    }
}
