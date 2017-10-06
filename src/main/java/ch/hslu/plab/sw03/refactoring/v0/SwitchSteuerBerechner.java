package ch.hslu.plab.sw03.refactoring.v0;

public class SwitchSteuerBerechner {

    public int calcualteTax(Person person){
        switch (person.getCountry()){
            case "US":
                return person.getLohn() * 100;
            case "CH":
                return person.getLohn() * 10;
            case "DE":
                return person.getLohn() * 50;
            default:
                throw new UnsupportedOperationException(String.format("calculateTax is not implemented for Person with locale '%s'", person.getCountry()));
        }
    }
}
