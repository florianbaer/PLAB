package ch.hslu.plab.sw03.refactoring.v2;


import java.util.HashMap;
import java.util.NoSuchElementException;

public class TaxCalculatorProvider implements ITaxCalculatorProvider {

    private HashMap<String, ITaxCalculator> calculators = new HashMap<String, ITaxCalculator>();

    public void addCalculator(String countryCode, ITaxCalculator calculator){
        this.calculators.put(countryCode, calculator);
    }

    @Override
    public ITaxCalculator getCalculator(String countryCode) {
        if(this.calculators.containsKey(countryCode)){
            return this.calculators.get(countryCode);
        }
        throw new NoSuchElementException(String.format("No calculator for country code '%s' available", countryCode));
    }
}
