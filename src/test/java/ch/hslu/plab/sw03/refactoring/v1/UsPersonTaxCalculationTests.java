package ch.hslu.plab.sw03.refactoring.v1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UsPersonTaxCalculationTests {


    @Test
    public void UsPersonTaxCalculationTest(){
        IPerson americanTaxPayer = new Person("US",  "USA", 40000);
        TaxCalcExecutor swissTaxCalculationExecutor = new TaxCalcExecutor(new UsTaxAlgorithm());
        double taxResult = swissTaxCalculationExecutor.executeCalcuation(americanTaxPayer.getSalary());
        assertEquals(8000, taxResult, 0.001);
    }
}
