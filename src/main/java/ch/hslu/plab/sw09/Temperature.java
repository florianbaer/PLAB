package ch.hslu.plab.sw09;

import java.util.Objects;

/**
 * Represents a temperature
 *
 * @author Yannick Bättig, Florian Bär
 */
public final class Temperature {
    private static final float DEFAULT_TEMPERATURE_CELSIUS = 20f;
    private static final float KELVIN_TO_CELSIUS_OFFSET = 273.15f;
    private static final float KELVIN_TO_FAHRENHEIT_FACTOR = 9f/5f;
    private static final float FAHRENHEIT_TO_KELVIN_FACTOR = 5f/9f;
    private static final float KELVIN_TO_FAHRENHEIT_OFFSET = 459.67f;

    private float temperatureInKelvin;

    /**
     * Initialize an temperature without setting the temperature
     * (the default temperature is set to 0K)
     * Consider using the constructor {@link #Temperature}
     */
    private Temperature() {
        // set temperature to default value
        setTemperatureInCelsius(DEFAULT_TEMPERATURE_CELSIUS);
    }


    public float getTemperatureInKelvin() {
        return this.temperatureInKelvin;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.temperatureInKelvin);
    }

    public float getTemperatureInCelsius() {
        return (this.temperatureInKelvin - KELVIN_TO_CELSIUS_OFFSET);
    }

    private void setTemperatureInCelsius(float temperatureInCelsius) {
    }

    public float getTemperatureInFahrenheit() {
        return (this.temperatureInKelvin * KELVIN_TO_FAHRENHEIT_FACTOR - KELVIN_TO_FAHRENHEIT_OFFSET);
    }

    public static final Temperature GetTemperatureInCelsius(float tempInCel){
        Temperature cel =  new Temperature();
        cel.temperatureInKelvin = (tempInCel + KELVIN_TO_CELSIUS_OFFSET);
        return cel;
    }

    public static final Temperature GetTemperatureInKelvin(float tempInKel){
        Temperature cel =  new Temperature();
        if (tempInKel < 0) {
            throw new IllegalArgumentException("Temperature in Kelvin cannot be lower than 0");
        }
        cel.temperatureInKelvin = tempInKel;
        return cel;
    }
}
