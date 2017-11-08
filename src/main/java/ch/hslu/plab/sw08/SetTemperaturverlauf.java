package ch.hslu.plab.sw08;

import ch.hslu.plab.sw03.kontrollstrukturen.Temperature;

import java.util.*;

public class SetTemperaturverlauf {
    private Set<Temperature> temperaturen;

    public SetTemperaturverlauf(){
        this.temperaturen = new LinkedHashSet<Temperature>();
    }

    public Set<Temperature> getTemperaturen() {
        return temperaturen;
    }

    public void setTemperaturen(Set<Temperature> temperaturen) {
        this.temperaturen = temperaturen;
    }

    public void add(Temperature temperatureToAdd){
        this.temperaturen.add(temperatureToAdd);
    }

    public void clear(){
        this.temperaturen = new LinkedHashSet<Temperature>();
    }

    public int getCount(){
        return this.temperaturen.size();
    }

    public float getMaxTemp(){
        return Collections.max(this.temperaturen, new TemperatureComperator()).getTemperatureInKelvin();
    }

    public float getMinTemp(){
        return Collections.min(this.temperaturen, new TemperatureComperator()).getTemperatureInKelvin();
    }

    public double getAverage(){
        double sum = 0;
        Iterator<Temperature> iterator = temperaturen.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next().getTemperatureInKelvin();
        }
        return sum / temperaturen.size();
    }
}
