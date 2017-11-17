package ch.hslu.plab.sw09;

import java.util.Objects;

/**
 * Represents a temperature
 *
 * @author Yannick Bättig, Florian Bär
 */
public class TemperatureConstructors {
    private static final float DEFAULT_TEMPERATURE_CELSIUS = 20f;
    private static final float KELVIN_TO_CELSIUS_OFFSET = 273.15f;
    private static final float KELVIN_TO_FAHRENHEIT_FACTOR = 9f/5f;
    private static final float FAHRENHEIT_TO_KELVIN_FACTOR = 5f/9f;
    private static final float KELVIN_TO_FAHRENHEIT_OFFSET = 459.67f;

    private float temperatureInKelvin;

    /**
     * Initialize an temperature without setting the temperature
     * (the default temperature is set to 0K)
     * Consider using the constructor {@link #TemperatureConstructors(float, TemperatureType)}
     */
    public TemperatureConstructors() {
        // set temperature to default value
        setTemperatureInCelsius(DEFAULT_TEMPERATURE_CELSIUS);
    }

    /**
     * Initialize new temperature with a given value
     * @param temperature
     */
    public TemperatureConstructors(float temperature, TemperatureType type) {
        if(type == TemperatureType.CELSIUS){
            setTemperatureInCelsius(temperature);
        } else {
            setTemperatureInKelvin(temperature);
        }
    }

    public float getTemperatureInKelvin() {
        return this.temperatureInKelvin;
    }

    private void setTemperatureInKelvin(float temperatureInKelvin) {
        if (temperatureInKelvin < 0) {
            throw new IllegalArgumentException("Temperature in Kelvin cannot be lower than 0");
        }
        this.temperatureInKelvin = temperatureInKelvin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.temperatureInKelvin);
    }

    public float getTemperatureInCelsius() {
        return (this.temperatureInKelvin - KELVIN_TO_CELSIUS_OFFSET);
    }

    private void setTemperatureInCelsius(float temperatureInCelsius) {
        this.temperatureInKelvin = (temperatureInCelsius + KELVIN_TO_CELSIUS_OFFSET);
    }

    public float getTemperatureInFahrenheit() {
        return (this.temperatureInKelvin * KELVIN_TO_FAHRENHEIT_FACTOR - KELVIN_TO_FAHRENHEIT_OFFSET);
    }

    /**
     * Add a given number (temperature in kelvin) to the previously set temperature.
     * @param addingNumber value to add (negative values for subtracting)
     */
    public void plusKelvin(float addingNumber) {
        this.temperatureInKelvin += addingNumber;
    }

    /**
     * Add a given number (temperature in celsius) to the previously set temperature.
     * @param addingNumber value to add (negative values for subtracting)
     */
    public void plusCelsius(float addingNumber) {
        setTemperatureInCelsius(getTemperatureInCelsius() + addingNumber);
    }

}
