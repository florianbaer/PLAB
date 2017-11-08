package ch.hslu.plab.sw08;

import ch.hslu.plab.sw03.kontrollstrukturen.Temperature;

import java.util.Comparator;

public class TemperatureComperator implements Comparator<Temperature> {
    @Override
    public int compare(Temperature o1, Temperature o2) {
        if(o1.getTemperatureInCelsius() < o2.getTemperatureInCelsius()){
            return -1;
        } else if (o1.getTemperatureInCelsius() == o2.getTemperatureInCelsius()){
            return 0;
        }
        return 1;
    }
}
