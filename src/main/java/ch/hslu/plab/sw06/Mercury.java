package ch.hslu.plab.sw06;

import ch.hslu.plab.sw03.kontrollstrukturen.Temperature;

public class Mercury extends Element {
    private static final float MAX_SOLID_TEMPERATURE = 234.32f;
    private static final float MAX_FLUID_TEMPERATURE = 630.2f;
    private static final String ATTRIBUTES = "GIFTIG ";

    public Mercury() {
        this.maxSolidTemperature = new Temperature(MAX_SOLID_TEMPERATURE);
        this.maxFluidTemperature = new Temperature(MAX_FLUID_TEMPERATURE);
    }

    @Override
    public String toString() {
        return ATTRIBUTES + super.toString();
    }
}
