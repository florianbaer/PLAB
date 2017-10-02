package ch.hslu.plab.sw01;

public class HeizelementTyp {
    private String name;

    public HeizelementTyp(String name){
        this.name = name;
    }

    public void Heizen(int temperature){
        System.out.println("Heize auf ${temperature}");
    }
}
