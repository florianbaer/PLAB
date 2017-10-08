package ch.hslu.plab.sw03.kontrollstrukturen2;

public class ConfigurableGaseousElement implements IGaseousElementState {

    private String element;
    private String elementName;
    private double meltingTemp;
    private double boilingTemp;

    public ConfigurableGaseousElement(String element, String elementName, double meltingTemp, double boilingTemp){
        this.element = element;
        this.elementName = elementName;
        this.meltingTemp = meltingTemp;
        this.boilingTemp = boilingTemp;
    }

    @Override
    public String getElement() {
        return this.element;
    }

    @Override
    public String getElementName() {
        return this.elementName;
    }

    @Override
    public double getMeltingTemperature() {
        return this.meltingTemp;
    }

    @Override
    public double getBoilingTemperature() {
        return this.boilingTemp;
    }
}
