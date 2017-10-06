package ch.hslu.plab.sw03.refactoring.v2;

public class DeTaxCalculator implements ITaxCalculator {

    @Override
    public double getTaxAlgorithm(double salary) {
        return 50 + salary * 1.5;
    }
}
