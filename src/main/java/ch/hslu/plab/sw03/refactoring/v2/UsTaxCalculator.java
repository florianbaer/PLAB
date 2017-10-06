package ch.hslu.plab.sw03.refactoring.v2;

public class UsTaxCalculator implements ITaxCalculator {

    @Override
    public double getTaxAlgorithm(double salary) {
        return 100 * salary;
    }
}
