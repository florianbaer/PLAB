package ch.hslu.plab.sw03.refactoring.v1;

public class TaxCalcExecutor {
    private ITaxCalculator calculator;

    public TaxCalcExecutor(ITaxCalculator calculator){
        this.calculator = calculator;
    }

    public double executeCalcuation(IPerson person){
        return this.calculator.getTaxAlgorithm(person.getSalary());
    }
}
