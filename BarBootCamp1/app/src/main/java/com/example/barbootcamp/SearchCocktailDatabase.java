package com.example.barbootcamp;

import com.example.barbootcamp.model.Cocktail;

import java.util.HashMap;
import java.util.List;

public class SearchCocktailDatabase {
    public static HashMap<Integer, Cocktail>cocktails = new HashMap<>();

    public static Cocktail getCocktailById(int idDrink){
        return cocktails.get(idDrink);
    }

    public static List<Cocktail> getAllCocktails(){
        return (List)cocktails.values();
    }

    public static void saveCocktailsToDatabase(List<Cocktail>cocktailToSave){
        for (int i = 0; i < cocktailToSave.size(); i++){
            Cocktail cocktail = cocktailToSave.get(i);
            cocktails.put(cocktail.getIdDrink(), cocktail);
        }
    }

}
