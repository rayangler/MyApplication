package com.example.raymundrodriguez.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raymundrodriguez on 2/2/18.
 */

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if(color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("light")){
            brands.add("Jale Ale Pale");
            brands.add("Gout Stout");
        } else if (color.equals("dark")) {
            brands.add("Chocolate");
        } else if (color.equals("brown")) {
            brands.add("Charlie");
        }
        return brands;
    }
}
