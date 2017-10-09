package ch.hslu.plab.sw03.refactoring.v2;


public interface ITaxCalculatorProvider {
    void addCalculator(String countryName, ITaxCalculator calculator);
    ITaxCalculator getCalculator(String countryName);
}
