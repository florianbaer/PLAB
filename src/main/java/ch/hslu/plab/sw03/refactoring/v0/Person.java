package ch.hslu.plab.sw03.refactoring.v0;

import java.util.Locale;

public class Person {
    private Locale locale;
    private int lohn;

    public Person(String lang, String country, int lohn){
        this.lohn = lohn;
        this.locale = new Locale(lang, country);
    }
    public String getCountry(){
        return this.locale.getCountry();
    }
    public int getLohn(){
        return this.lohn;
    }
}
