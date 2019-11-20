package com.example.barbootcamp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.barbootcamp.R;
import com.example.barbootcamp.activities.CocktailAdapter;
import com.example.barbootcamp.database.CocktailDatabase;
import com.example.barbootcamp.model.Cocktail;
import com.example.barbootcamp.model.CocktailSeach;
import com.example.barbootcamp.model.CocktailSearchResponse;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CocktailRecyclerFragment extends Fragment {
    private RecyclerView recyclerView_cocktail;
    private EditText searchEditText;
    private ImageButton search_btn;
    private ArrayList<Cocktail>cocktailList;
    private TextView setSearchText;
    private CocktailDatabase cocktaildb;
    private String searchInput;

    public CocktailRecyclerFragment(){

    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){

        final View view = inflater.inflate(R.layout.fragment_cocktail_recycler, container, false);
        recyclerView_cocktail = view.findViewById(R.id.cocktail_rv);


        setSearchText = view.findViewById(R.id.cocktail_setSearchText);
        searchEditText = view.findViewById(R.id.cocktail_searchText);
        search_btn = view.findViewById(R.id.cocktail_searchBtn);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView_cocktail.setLayoutManager(layoutManager);
        final CocktailAdapter cocktailAdapter = new CocktailAdapter();
        final RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        String url = "https://www.thecocktaildb.com/api/json/v1/1/search.php?f=b";

        Response.Listener<String>responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                CocktailSearchResponse cocktailSearchResponse = gson.fromJson(response, CocktailSearchResponse.class);
                CocktailSeach cocktailSeach = cocktailSearchResponse.getResults();
                List<Cocktail>cocktailresults = cocktailSeach.getCocktails();

                cocktailAdapter.setCocktailData(cocktailresults);
                recyclerView_cocktail.setAdapter(cocktailAdapter);

                requestQueue.stop();
            }
        };
        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("Request Failed");
                requestQueue.stop();
            }
        };
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, responseListener, errorListener);

        requestQueue.add(stringRequest);
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                System.out.println("Request Responded");
//                Gson gson = new Gson();
//                Cocktail cocktail = gson.fromJson(response, Cocktail.class);
//                cocktaildb = CocktailDatabase.getInstance(getContext());
//                ArrayList<Cocktail> newList = new ArrayList<Cocktail>(cocktailList);
//                cocktaildb.cocktailDao().insertAll(newList);
//                cocktailAdapter.setCocktailData(cocktailList);
//                recyclerView_cocktail.setAdapter(cocktailAdapter);
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                System.out.println("The Request Failed");
//            }
//
//        });
//        requestQueue.add(stringRequest);
//        search_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                searchInput = searchEditText.getText().toString();
//                String searchText = setSearchText.getText().toString();
//
//                RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
//                String url = "https://www.thecocktaildb.com/api/json/v1/1/search.php?f="+searchText;
//                StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        System.out.println("Request Responded");
//                        Gson gson = new Gson();
//                        cocktailArray = gson.fromJson(response, Cocktail[].class);
//                        cocktailList = Arrays.asList(cocktailArray);
//                        cocktaildb = CocktailDatabase.getInstance(getContext());
//                        ArrayList<Cocktail> newList = new ArrayList<>(cocktailList);
//                        cocktaildb.cocktailDao().insertAll(newList);
//                        cocktailAdapter.setCocktailData(cocktailList);
//                        recyclerView_cocktail.setAdapter(cocktailAdapter);
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        System.out.println("The Request Failed");
//                    }
//
//                });
//                requestQueue.add(stringRequest);
//            }
//        });
        return view;
        }
    }
