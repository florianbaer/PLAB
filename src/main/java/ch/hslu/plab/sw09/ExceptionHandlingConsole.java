package ch.hslu.plab.sw09;

import ch.hslu.plab.sw02.Temperature;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ExceptionHandlingConsole {


    private static final Logger logger = LogManager.getLogger(ExceptionHandlingConsole.class);
    public static void main(String[] args) {
        logger.debug("Exceptionhandling example is started");
        String input;
        Scanner scanner = new Scanner(System.in);
        logger.debug("Scanner is instantiated");
        do {

            logger.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try
            {

                float temperatureFloat = Float.valueOf(input);
                logger.log(Level.DEBUG, "Casted input successfully to float");
                Temperature temperature = new Temperature(temperatureFloat);
                logger.info(temperature.getTemperatureInKelvin());
            }
            catch (NumberFormatException numberFormatException){
                logger.error(input + " ist keine Zahl. Bitte geben Sie eine gültige Zahl ein.", numberFormatException);
            }
        } while (!input.equals("exit"));
        logger.debug("Programm beendet.");
    }
}
