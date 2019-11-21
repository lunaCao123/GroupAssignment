package com.example.barbootcamp.model;

import java.util.ArrayList;
import java.util.List;

public class CocktailSearchResponse {

    public ArrayList<Cocktail> drinks;

    public ArrayList<Cocktail> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<Cocktail> drinks) {
        this.drinks = drinks;
    }
}
