package com.example.barbootcamp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barbootcamp.R;
import com.example.barbootcamp.model.Cocktail;

import java.util.ArrayList;

public class CocktailFavouriteFragment extends Fragment {

    private RecyclerView recyclerView;
    public static ArrayList<Cocktail>favCocktails = new ArrayList<>();

    public CocktailFavouriteFragment(){

    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_cocktailfavourite_recycler, container, false);

        recyclerView = view.findViewById(R.id.favourite_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        return view;
    }
}
