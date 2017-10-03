package ch.hslu.plab.sw02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unittests for {@link Temperature}
 *
 * @author Claudio Huebscher, Jan Bucher
 */
public class TemperatureTests {
    @Test
    public void testTemperatureConstructor() {
        // fixture
        float exampleTemperature = 22.98f;

        // call SUT
        Temperature sut = new Temperature(exampleTemperature);

        // assert
        assertEquals(exampleTemperature, sut.getTemperatureInKelvin(), 0.01);
    }

    @Test
    public void testTemperatureSetter() {
        // fixture
        float exampleTemperature = 22.98f;

        // call SUT
        Temperature sut = new Temperature();
        sut.setTemperatureInKelvin(exampleTemperature);

        // assert
        assertEquals(exampleTemperature, sut.getTemperatureInKelvin(), 0.01);
    }

    @Test
    public void testTemperatureGetInCelsius() {
        // fixture
        float exampleTemperature = 280.54f;

        // call SUT
        Temperature sut = new Temperature(exampleTemperature);

        // assert
        float expectedTemperatureInCelsius = 7.39f; // 280.54 - 273.15
        assertEquals(expectedTemperatureInCelsius, sut.getTemperatureInCelsius(), 0.01);
    }

    @Test
    public void testTemperatureGetInFahrenheit() {
        // fixture
        float exampleTemperature = 180f;

        // call SUT
        Temperature sut = new Temperature(exampleTemperature);

        // assert
        float expectedTemperatureInFahrenheit = -135.67f; // 180 * 9/5 - 459.67
        assertEquals(expectedTemperatureInFahrenheit, sut.getTemperatureInFahrenheit(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTemperatureSetTemperature_illegalValue() {
        // fixture
        float exampleTemperature = -200f;

        // call SUT
        new Temperature(exampleTemperature);
    }

    @Test
    public void testTemperatureSetTemperatureInCelsius() {
        // fixture
        float exampleTemperatureCelsius = 28f;

        // call SUT
        Temperature sut = new Temperature();
        sut.setTemperatureInCelsius(exampleTemperatureCelsius);

        // assert
        float expectedTemperatureInKelvin = 301.15f; // 28 + 273.15
        assertEquals(expectedTemperatureInKelvin, sut.getTemperatureInKelvin(), 0.01);
        float expectedTemperatureInFahrenheit = 82.4f; // 28 * 9/5 + 32
        assertEquals(expectedTemperatureInFahrenheit, sut.getTemperatureInFahrenheit(), 0.01);
    }

    @Test
    public void testTemperatureSetTemperatureInFahrenheit() {
        // fixture
        float exampleTemperatureFahrenheit = 80f;

        // call SUT
        Temperature sut = new Temperature();
        sut.setTemperatureInFahrenheit(exampleTemperatureFahrenheit);

        // assert
        float expectedTemperatureInKelvin = 299.82f; // (80 + 459.67) * 5/9
        assertEquals(expectedTemperatureInKelvin, sut.getTemperatureInKelvin(), 0.01);
        float expectedTemperatureInCelsius = 26.67f; // (80 - 32) * 5/9
        assertEquals(expectedTemperatureInCelsius, sut.getTemperatureInCelsius(), 0.01);
    }

    @Test
    public void testTemperatureMinimum() {
        // fixture
        float minimumTemperatureInKelvin = 0f;

        // call SUT
        Temperature sut = new Temperature(minimumTemperatureInKelvin);

        // assert
        float expectedTemperatureInCelsius = -273.15f; // 0 - 273.15
        assertEquals(expectedTemperatureInCelsius, sut.getTemperatureInCelsius(), 0.01);
        float expectedTemperatureInFahrenheit = -459.67f; // (0  * 9/5) - 459.67
        assertEquals(expectedTemperatureInFahrenheit, sut.getTemperatureInFahrenheit(), 0.01);
    }

    @Test
    public void testTemperatureMaximum() {
        // fixture
        float minimumTemperatureInKelvin = 500f;

        // call SUT
        Temperature sut = new Temperature(minimumTemperatureInKelvin);

        // assert
        float expectedTemperatureInCelsius = 226.85f; // 500 - 273.15
        assertEquals(expectedTemperatureInCelsius, sut.getTemperatureInCelsius(), 0.01);
        float expectedTemperatureInFahrenheit = 440.33f; // (500  * 9/5) - 459.67
        assertEquals(expectedTemperatureInFahrenheit, sut.getTemperatureInFahrenheit(), 0.01);
    }

    @Test
    public void testTemperaturePlusKelvin_add() {
        // fixture
        float startKelvin = 100f;
        float deltaKelvin = 20f;

        // call SUT
        Temperature sut = new Temperature(startKelvin);
        sut.plusKelvin(deltaKelvin);

        // assert
        float expectedTemperature = 120f;
        assertEquals(expectedTemperature, sut.getTemperatureInKelvin(), 0.01);
    }

    @Test
    public void testTemperaturePlusKelvin_subtract() {
        // fixture
        float startKelvin = 100f;
        float deltaKelvin = -20f;

        // call SUT
        Temperature sut = new Temperature(startKelvin);
        sut.plusKelvin(deltaKelvin);

        // assert
        float expectedTemperature = 80f;
        assertEquals(expectedTemperature, sut.getTemperatureInKelvin(), 0.01);
    }

    @Test
    public void testTemperaturePlusCelsius_add() {
        // fixture
        float startCelsius = 31.4f;
        float deltaCelsius = 19f;

        // call SUT
        Temperature sut = new Temperature();
        sut.setTemperatureInCelsius(startCelsius);
        sut.plusCelsius(deltaCelsius);

        // assert
        float expectedTemperature = 50.4f;
        assertEquals(expectedTemperature, sut.getTemperatureInCelsius(), 0.01);
    }

    @Test
    public void testTemperaturePlusCelsius_subtract() {
        // fixture
        float startCelsius = 31.4f;
        float deltaCelsius = -19f;

        // call SUT
        Temperature sut = new Temperature();
        sut.setTemperatureInCelsius(startCelsius);
        sut.plusCelsius(deltaCelsius);

        // assert
        float expectedTemperature = 12.4f;
        assertEquals(expectedTemperature, sut.getTemperatureInCelsius(), 0.01);
    }

    @Test
    public void testTemperatureDefaultValue() {
        // call SUT
        Temperature sut = new Temperature();

        // assert
        float expectedTemperatureInCelsius = 20f;
        assertEquals(expectedTemperatureInCelsius, sut.getTemperatureInCelsius(), 0.01);
    }

}
