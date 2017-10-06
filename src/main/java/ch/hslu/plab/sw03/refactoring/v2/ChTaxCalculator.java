package ch.hslu.plab.sw03.refactoring.v2;

public class ChTaxCalculator implements ITaxCalculator {

    @Override
    public double getTaxAlgorithm(double salary) {
        return (salary - 10) / 15;
    }
}
