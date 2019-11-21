package com.example.barbootcamp.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.barbootcamp.R;
import com.example.barbootcamp.model.Cocktail;

import java.util.List;

public class CocktailAdapter extends RecyclerView.Adapter<CocktailAdapter.CocktailViewHolder> {

    private List<Cocktail>cocktailsToAdapt;
    public void setCocktailData(List<Cocktail>cocktailsToAdapt){
        this.cocktailsToAdapt = cocktailsToAdapt;
    }

    @NonNull
    @Override
    public CocktailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cocktail, parent, false);

        CocktailViewHolder cocktailViewHolder = new CocktailViewHolder(view);

        return cocktailViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CocktailViewHolder holder, int position) {
        final Cocktail cocktailAtPosition = cocktailsToAdapt.get(position);
        holder.cocktailNameTextView.setText(cocktailAtPosition.getStrDrink());
        holder.cocktailTypeTextview.setText(cocktailAtPosition.getStrCategory());
        if(cocktailAtPosition.getStrDrinkThumb() != null){
            String image = cocktailAtPosition.getStrDrinkThumb();
            Glide.with(holder.view.getContext()).load(image).into(holder.cocktailImage);
        }else{
            Glide.with(holder.view.getContext()).load(R.drawable.cocktails).into(holder.cocktailImage);
        }


    }

    @Override
    public int getItemCount() {
        return cocktailsToAdapt.size();
    }

    public class CocktailViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView cocktailNameTextView;
        public TextView cocktailTypeTextview;
        public ImageView cocktailImage;


        public CocktailViewHolder(View v) {
            super(v);
            view = v;
            cocktailTypeTextview = v.findViewById(R.id.cocktail_cocktailTypeText);
            cocktailNameTextView = v.findViewById(R.id.cocktail_cocktailNameText);
            cocktailImage = v.findViewById(R.id.cocktail_image);
        }




//            String imageUrl = cocktail.getStrDrinkThumb();
//            if(imageUrl != null){
//                Glide.with(view.getContext()).load(imageUrl).into(cocktailImage);
//            }else{
//                Glide.with(view.getContext()).load(R.drawable.cocktails).into(cocktailImage);
//            }


        }
    }

