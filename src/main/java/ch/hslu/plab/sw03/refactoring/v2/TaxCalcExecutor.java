package ch.hslu.plab.sw03.refactoring.v2;

public class TaxCalcExecutor {
    private ITaxCalculatorProvider calculationProvider;

    public TaxCalcExecutor(ITaxCalculatorProvider calculationProvider){
        this.calculationProvider = calculationProvider;
    }

    public double executeCalculation(IPerson person){
        return this.calculationProvider.getCalculator(person.getCountryCode()).getTaxAlgorithm(person.getSalary());
    }
}
