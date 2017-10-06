package ch.hslu.plab.sw03.refactoring.v1;

import java.util.Locale;

public class Person implements IPerson {

    private Locale locale;
    private double salary;

    public Person(String locale, String country, double salary){
        this.locale = new Locale(locale, country);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String getCountryCode() {
        return this.locale.getCountry();
    }
}
