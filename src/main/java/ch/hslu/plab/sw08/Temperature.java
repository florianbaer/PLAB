package ch.hslu.plab.sw08;

import java.util.Objects;

public class Temperature extends ch.hslu.plab.sw02.Temperature implements Comparable<Temperature> {
    @Override
    public int compareTo(Temperature temperature) {
        if(temperature == null){
            throw new NullPointerException("Temperature is null");
        }

        return 0;
    }


    @Override
    public boolean equals(Object obj) {
        // self check
        if (this == obj)
            return true;
        // null check
        if (obj == null)
            return false;
        // type check and cast
        if (!(obj instanceof Temperature))
            return false;
        Temperature temperature = (Temperature) obj;
        // field comparison
        return Objects.equals(this.getTemperatureInCelsius(), temperature.getTemperatureInCelsius());
    }
}
