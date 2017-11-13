package ch.hslu.plab.sw08;

import java.util.Objects;

public final class Temperature extends ch.hslu.plab.sw02.Temperature implements Comparable<Temperature> {
    @Override
    public int compareTo(Temperature o) {
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getTemperatureInKelvin());
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
        if (getClass() != obj.getClass())
            return false;
        Temperature temperature = (Temperature) obj;
        // field comparison
        return Objects.equals(this.getTemperatureInCelsius(), temperature.getTemperatureInCelsius());
    }
}
