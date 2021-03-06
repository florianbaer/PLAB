package ch.hslu.plab.sw08;

import ch.hslu.plab.sw03.kontrollstrukturen.Temperature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Temperaturverlauf {
    private List<Temperature> temperaturen;

    public Temperaturverlauf(){
        this.temperaturen = new ArrayList<>();
    }

    public List<Temperature> getTemperaturen() {
        return temperaturen;
    }

    public void setTemperaturen(List<Temperature> temperaturen) {
        this.temperaturen = temperaturen;
    }

    public void add(Temperature temperatureToAdd){
        this.temperaturen.add(temperatureToAdd);
    }

    public void clear(){
        this.temperaturen = new ArrayList<Temperature>();
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
