package ch.hslu.plab.sw03.refactoring.v1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChPersonTaxCalculationTests {

    @Test
    public void SwissPersonTaxCalculationTest(){
        IPerson swissPerson = new Person("CH",  "Switzerland", 50000);
        TaxCalcExecutor swissTaxCalculationExecutor = new TaxCalcExecutor(new ChTaxAlgorithm());
        double taxResult = swissTaxCalculationExecutor.executeCalcuation(swissPerson.getSalary());
        assertEquals(3332.66666, taxResult, 0.001);
    }
}
