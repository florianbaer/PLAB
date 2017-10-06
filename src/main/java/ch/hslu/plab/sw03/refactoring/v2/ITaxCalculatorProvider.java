package ch.hslu.plab.sw03.refactoring.v2;


public interface ITaxCalculatorProvider {
    ITaxCalculator getCalculator(String countryCode);
}
