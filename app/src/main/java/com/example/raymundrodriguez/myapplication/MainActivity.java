package com.example.raymundrodriguez.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when the user clicks the button
    public void onClickFindBeer(View view) {
        // findViewById() is basically the equivalent of being able to access GUI components
        // Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        // Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        // Get the selected item from the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        // Get a list of brands depending on the beer type
        List<String> brandsList = expert.getBrands(beerType);
        // Builds a string using the values in the list
        StringBuilder brandsFormatted = new StringBuilder();
        // Similar to python: "for brands in brandList"
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n'); // Display ea. brand in a new line
        }
        // Display the beers
        brands.setText(brandsFormatted);
    }
}
