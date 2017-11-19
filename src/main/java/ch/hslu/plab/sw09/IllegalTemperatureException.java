package ch.hslu.plab.sw09;

public class IllegalTemperatureException extends Exception {
    public IllegalTemperatureException() { super(); }
    public IllegalTemperatureException(String message) { super(message); }
    public IllegalTemperatureException(String message, Throwable cause) { super(message, cause); }
    public IllegalTemperatureException(Throwable cause) { super(cause); }
}
