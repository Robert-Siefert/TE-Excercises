package com.techelevator.noiseexample;

import java.util.ArrayList;
import java.util.List;

public class Soundboard {


    public static void main(String[] args) {

        INoise bird = new Bird();
        INoise siren = new Siren();


        ISellable aSiren = new Siren();


        Siren castedSiren = (Siren) aSiren;


        List<INoise> items = new ArrayList<>();
        items.add(bird);
        items.add(siren);

        for (INoise item : items) {
            System.out.println(item.makeNoise());
        }





    }
}
