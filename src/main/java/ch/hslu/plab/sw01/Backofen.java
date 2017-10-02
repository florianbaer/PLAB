package ch.hslu.plab.sw01;

public class Backofen {
    private String model;
    private Heizelement[] heizelemente;
    private Uhr uhr;
    private Tuere tuere;

    public Backofen(String model, Heizelement[] heizelemente, Uhr uhr, Tuere tuere){

        this.model = model;
        this.heizelemente = heizelemente;
        this.uhr = uhr;
        this.tuere = tuere;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Heizelement[] getHeizelemente() {
        return heizelemente;
    }

    public void setHeizelemente(Heizelement[] heizelemente) {
        this.heizelemente = heizelemente;
    }

    public Uhr getUhr() {
        return uhr;
    }

    public void setUhr(Uhr uhr) {
        this.uhr = uhr;
    }

    public Tuere getTuere() {
        return tuere;
    }

    public void Erwaehrmen(int temperature){
        for (Heizelement element : this.getHeizelemente()) {
            element.setTemperature(temperature);
        }
    }
}
