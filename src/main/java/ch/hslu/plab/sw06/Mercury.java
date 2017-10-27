package ch.hslu.plab.sw06;

import ch.hslu.plab.sw03.kontrollstrukturen.Temperature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Mercury extends Element {
    Logger logger = LogManager.getLogger(Mercury.class);
    private static final float MAX_SOLID_TEMPERATURE = 234.32f;
    private static final float MAX_FLUID_TEMPERATURE = 630.2f;
    private static final String ATTRIBUTES = "GIFTIG ";

    public Mercury() {
        this.maxSolidTemperature = new Temperature(MAX_SOLID_TEMPERATURE);
        this.maxFluidTemperature = new Temperature(MAX_FLUID_TEMPERATURE);
        logger.info("Create instance of mercury with temperatures melting temperature '{}' and gaseous temperture '{}'", MAX_SOLID_TEMPERATURE, MAX_FLUID_TEMPERATURE);
    }

    @Override
    public String toString() {
        return ATTRIBUTES + super.toString();
    }
}
