package ch.hslu.plab.sw09;

public enum TemperatureUnit {
    CELSIUS(0f), KELVIN(273.15f);

    private final float offset;

    TemperatureUnit(float offset) {
        this.offset = offset;
    }

    public float getOffset(){
        return offset;
    }

}
