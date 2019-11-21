package com.example.barbootcamp.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.barbootcamp.model.Cocktail;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface CocktailDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertAll(ArrayList<Cocktail>cocktails);

    @Query("SELECT * FROM Cocktail")
    List<Cocktail>getAllCocktails();

    @Query("SELECT * FROM cocktail WHERE idDrink = :idDrink")
    Cocktail findCocktailById(int idDrink);
}
