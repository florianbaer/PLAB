package ch.hslu.plab.sw03.refactoring.v1;

public class TaxCalcExecutor {
    private ITaxAlgorithm calculator;

    public TaxCalcExecutor(ITaxAlgorithm calculator){
        this.calculator = calculator;
    }

    public double executeCalcuation(double salary){
        return this.calculator.getTaxAlgorithm(salary);
    }
}
