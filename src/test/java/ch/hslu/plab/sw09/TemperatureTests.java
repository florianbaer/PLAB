package ch.hslu.plab.sw09;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

public class TemperatureTests {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testEquals() throws Exception {
        EqualsVerifier.forClass(Temperature.class).suppress(Warning.NONFINAL_FIELDS).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED).usingGetClass().verify();
    }

    @Test
    public void testHashcode() throws Exception {
        Temperature temperatur = Temperature.createFromCelsius(20);
        Temperature temperatur1 = Temperature.createFromCelsius(20);

        int expected = temperatur.hashCode();
        int actual = temperatur1.hashCode();

        assertEquals(expected,actual);
    }

    @Test
    public void testCompareTo() throws Exception {
        Temperature temperatur = Temperature.createFromCelsius(20);
        Temperature temperatur1 = Temperature.createFromCelsius(30);

        int expected = -1; // kleiner
        int actual = temperatur.compareTo(temperatur1);

        assertEquals(expected, actual);
    }

    @Test
    public void testStatic() throws Exception {
        float actual = Temperature.kelvinToCelsius(273.15f);
        float expected = 0;

        assertEquals(expected, actual, 0.1f);
    }

    @Test
    public void testIllegalArgumentException() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        // thrown.expectMessage("ungültige Temperatur"); containsstring is not implemented..?
        Temperature.createFromKelvin(-1);
    }

    @Test
    public void testTemperatureIsImmutable() {
        assertImmutable(Temperature.class);
    }


}
