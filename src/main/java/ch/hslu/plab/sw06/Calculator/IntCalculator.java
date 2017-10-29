package ch.hslu.plab.sw06.Calculator;

import ch.hslu.plab.sw06.Calculator.Interfaces.IntegerCalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * {@inheritDoc}
 */
public class IntCalculator  implements IntegerCalculator{

    private boolean negativLogging;

    /**
     * Constructor creates instance with negativ logging disabled.
     */
    public IntCalculator(){
        this(false);
    }

    /**
     * Creates a new instance of the integer calculator.
     * @param negativLogging True if logging of negativ results is enabled.
     */
    public IntCalculator(boolean negativLogging){
        logger.info("Calculator instance created with negativLogger {}.", negativLogging ? "enabled" : "disabled");
        this.negativLogging = negativLogging;
    }

    /**
     * The logger for this class.
     */
    Logger logger = LogManager.getLogger(IntCalculator.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public int add(int firstNumber, int secondNumber) {
        logger.info("Calculator calculates result from summand {} and summand {}", firstNumber, secondNumber);
        int result = Math.addExact(firstNumber,secondNumber);
        if(negativLogging && result < 0){
            logger.warn("Result is negativ. '{}' is below zero", result);
        }
        return result;
    }
}
