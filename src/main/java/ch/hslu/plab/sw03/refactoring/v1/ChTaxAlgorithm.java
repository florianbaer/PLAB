package ch.hslu.plab.sw03.refactoring.v1;

public class ChTaxAlgorithm implements ITaxAlgorithm {

    @Override
    public double getTaxAlgorithm(double salary) {
        return (salary - 10) / 15;
    }
}
