package ch.hslu.plab.sw03.refactoring.v1;

public class UsTaxAlgorithm implements ITaxAlgorithm {


    @Override
    public double getTaxAlgorithm(double salary) {
        return 100 * salary;
    }
}
