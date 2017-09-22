package com.baerdev.backofen;

public class Heizelement {

    private int temperature = 0;
    private HeizelementTyp typ;

    public Heizelement(HeizelementTyp typ){
        this.typ = typ;
    }

    public void setTemperature(int temperature) {
        this.typ.Heizen(temperature);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
