package ch.hslu.plab.sw03.refactoring.v0;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SwitchSteuernTests {
    @Test
    public void TestUsEnglishPerson(){
        Person person = new Person("ENGLISH", "US", 50000);
        double result = new SwitchSteuerBerechner().calcualteTax(person);
        assertEquals(50000*100.0, result);
    }

    @Test
    public void TestGermanPerson(){
        Person person = new Person("German", "DE", 50000);
        double result = new SwitchSteuerBerechner().calcualteTax(person);
        assertEquals(50000*50.0, result);
    }

    @Test
    public void TestSwissPerson(){
        Person person = new Person("Switzerland", "CH", 50000);
        double result = new SwitchSteuerBerechner().calcualteTax(person);
        assertEquals(50000*10.0, result);
    }
}
