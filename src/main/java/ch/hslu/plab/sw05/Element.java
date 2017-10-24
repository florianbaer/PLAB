package ch.hslu.plab.sw05;


import ch.hslu.plab.sw03.kontrollstrukturen.Temperature;

public abstract class Element {
    private static final String STATE_OF_MATTER_SOLID = "fest";
    private static final String STATE_OF_MATTER_FLUID = "fluessig";
    private static final String STATE_OF_MATTER_GASEOUS = "gasfoermig";

    protected Temperature maxSolidTemperature;
    protected Temperature maxFluidTemperature;


    public String getStateOfMatter(Temperature currentTemperature) {
        String result = null;

        if (currentTemperature.getTemperatureInKelvin() <= this.maxSolidTemperature.getTemperatureInKelvin()) {
            result = STATE_OF_MATTER_SOLID;
        }
        else if (currentTemperature.getTemperatureInKelvin() <= this.maxFluidTemperature.getTemperatureInKelvin()) {
            result = STATE_OF_MATTER_FLUID;
        }
        else {
            result = STATE_OF_MATTER_GASEOUS;
        }

        return result;
    }
}
