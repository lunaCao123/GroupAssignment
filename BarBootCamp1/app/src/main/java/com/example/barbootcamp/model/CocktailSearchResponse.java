package com.example.barbootcamp.model;

public class CocktailSearchResponse {
    public String strDink;
    public int idDrink;
    public String strCategory;
    public String strGlass;
    public int num_results;
    public CocktailSeach results;

    public String getStrDink() {
        return strDink;
    }

    public int getIdDrink() {
        return idDrink;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public int getNum_results() {
        return num_results;
    }

    public CocktailSeach getResults() {
        return results;
    }
}
