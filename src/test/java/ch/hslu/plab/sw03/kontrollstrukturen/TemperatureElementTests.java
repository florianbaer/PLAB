package ch.hslu.plab.sw03.kontrollstrukturen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureElementTests {
    private ConfigurableGaseousElement getNElement(){
        return new ConfigurableGaseousElement("N", "Stickstoff", 234.32,630.2);
    }

    private ConfigurableGaseousElement getHgElement(){
        return new ConfigurableGaseousElement("Hg", "Quecksilber", 234.32,630.2);
    }

    private ConfigurableGaseousElement getPbElement(){
        return new ConfigurableGaseousElement("Pb", "Blei", 63.05,77.15);
    }

    @Test
    public void StickstoffGaseousTest(){
        Temperature testableTemperature = new Temperature(233);
        GaseousState state = testableTemperature.getGaseousState(this.getHgElement());

        assertEquals(GaseousState.SOLID, state);
    }

}
