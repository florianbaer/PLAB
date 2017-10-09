package ch.hslu.plab.sw03.refactoring.v2;


import java.util.HashMap;
import java.util.NoSuchElementException;

public class TaxCalculatorProvider implements ITaxCalculatorProvider {

    private HashMap<String, ITaxCalculator> calculators = new HashMap<String, ITaxCalculator>();

    public void addCalculator(String countryName, ITaxCalculator calculator){
        this.calculators.put(countryName, calculator);
    }

    @Override
    public ITaxCalculator getCalculator(String countryName) {
        if(this.calculators.containsKey(countryName)){
            return this.calculators.get(countryName);
        }
        throw new NoSuchElementException(String.format("No calculator for country code '%s' available", countryName));
    }
}
