package ch.hslu.plab.sw03.refactoring.v1;

public class DeTaxAlgorithm implements ITaxAlgorithm {


    @Override
    public double getTaxAlgorithm(double salary) {
        return 50 + salary * 1.5;
    }
}
