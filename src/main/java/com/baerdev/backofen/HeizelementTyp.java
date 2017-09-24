package com.baerdev.backofen;

public class HeizelementTyp {
    private String name;

    public HeizelementTyp(String name){
        this.name = name;
    }

    public void Heizen(int temperature){
        System.out.println("Heize auf ${temperature}");
    }
}
