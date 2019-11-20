package com.example.barbootcamp.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.barbootcamp.model.Cocktail;

@Database(entities = {Cocktail.class}, version = 1)
public abstract class CocktailDatabase extends RoomDatabase {

    public abstract CocktailDao cocktailDao();
    private static CocktailDatabase instance;

    public static CocktailDatabase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context, CocktailDatabase.class, "cocktaildb")
                    .allowMainThreadQueries().build();
        }
        return instance;
    }
}
