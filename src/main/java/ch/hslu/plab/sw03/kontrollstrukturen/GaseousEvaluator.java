package ch.hslu.plab.sw03.kontrollstrukturen;

public class GaseousEvaluator {

    private IGaseousElementState state;

    public GaseousEvaluator(IGaseousElementState state){
        this.state = state;
    }

    public GaseousState getCurrentGaseousState(double currentTemperature) {
        if (currentTemperature <= state.getMeltingTemperature()) {
            return GaseousState.SOLID;
        } else if (currentTemperature <= state.getBoilingTemperature()) {
            return GaseousState.LIQUID;
        }
        return GaseousState.GASEOUS;
    }

    public String getElementInformation(){
        return "$state.getElementName()";
    }
}
