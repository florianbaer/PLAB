package ch.hslu.plab.sw03.refactoring.v2;

import org.junit.Test;

import java.util.NoSuchElementException;

import static junit.framework.TestCase.assertEquals;

public class TaxCalculationSwissPersonTests {
    public ITaxCalculatorProvider getCalculationProvider(){
        ITaxCalculatorProvider calcProvider = new TaxCalculatorProvider();
        calcProvider.addCalculator("SWITZERLAND", new ChTaxCalculator());
        calcProvider.addCalculator("USA", new UsTaxCalculator());
        calcProvider.addCalculator("GERMANY", new DeTaxCalculator());
        return calcProvider;
    }

    @Test
    public void SwissPersonPaysTaxesTest(){
        ITaxCalculatorProvider provider = this.getCalculationProvider();
        IPerson swissPerson = new Person("CH", "Switzerland", 65000);

        double taxesToPay = new TaxCalcExecutor(provider).executeCalculation(swissPerson);
        assertEquals(4332.666, taxesToPay, 0.001);
    }

    @Test(expected = NoSuchElementException.class)
    public void UnknownPersonPaysTaxesTest(){
        ITaxCalculatorProvider provider = this.getCalculationProvider();
        IPerson austrianPerson = new Person("AT", "Austria", 65000);

        double taxesToPay = new TaxCalcExecutor(provider).executeCalculation(austrianPerson);
    }
}
