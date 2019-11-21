package com.example.barbootcamp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.barbootcamp.R;
import com.example.barbootcamp.database.CocktailDatabase;
import com.example.barbootcamp.model.Cocktail;

public class CocktailDetailFragment extends Fragment {
    private TextView cocktailDetail_drinkNameTxt;
    private TextView cocktailDetail_glassTypeTxt;
    private TextView cocktailDetail_ing1Txt;
    private TextView cocktailDetail_ing2Txt;
    private TextView cocktailDetail_ing3Txt;
    private TextView cocktailDetail_ing4Txt;
    private TextView cocktailDetail_ing5Txt;
    private TextView cocktailDetail_ing6Txt;
    private TextView cocktailDetail_meas1Txt;
    private TextView cocktailDetail_meas2Txt;
    private TextView cocktailDetail_meas3Txt;
    private TextView cocktailDetail_meas4Txt;
    private TextView cocktailDetail_meas5Txt;
    private TextView cocktailDetail_meas6Txt;
    private TextView cocktailDetail_instructionTxt;
    private ImageView cocktailDetail_imageView;
    private int idDrink;
    private ImageView cocktailDetail_fav;
    private ImageView cocktailDetail_notFav;

    public CocktailDetailFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        idDrink = getArguments().getInt("idDrink");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_cocktaildetail, container, false);
        cocktailDetail_drinkNameTxt = view.findViewById(R.id.cocktailDetail_drinkName);
        cocktailDetail_glassTypeTxt = view.findViewById(R.id.cocktailDetail_glass);
        cocktailDetail_ing1Txt = view.findViewById(R.id.cocktailDetail_ing1);
        cocktailDetail_ing2Txt = view.findViewById(R.id.cocktailDetail_ing2);
        cocktailDetail_ing3Txt = view.findViewById(R.id.cocktailDetail_ing3);
        cocktailDetail_ing4Txt = view.findViewById(R.id.cocktailDetail_ing4);
        cocktailDetail_ing5Txt = view.findViewById(R.id.cocktailDetail_ing5);
        cocktailDetail_ing6Txt = view.findViewById(R.id.cocktailDetail_ing6);
        cocktailDetail_meas1Txt = view.findViewById(R.id.cocktailDetail_meas1);
        cocktailDetail_meas2Txt = view.findViewById(R.id.cocktailDetail_meas2);
        cocktailDetail_meas3Txt = view.findViewById(R.id.cocktailDetail_meas3);
        cocktailDetail_meas4Txt = view.findViewById(R.id.cocktailDetail_meas4);
        cocktailDetail_meas5Txt = view.findViewById(R.id.cocktailDetail_meas5);
        cocktailDetail_meas6Txt = view.findViewById(R.id.cocktailDetail_meas6);
        cocktailDetail_imageView = view.findViewById(R.id.cocktailDetail_image);
        cocktailDetail_notFav = view.findViewById(R.id.cocktailDetail_favboarder);
        cocktailDetail_fav = view.findViewById(R.id.cocktailDetail_favheart);
        cocktailDetail_fav.setVisibility(View.INVISIBLE);
        cocktailDetail_instructionTxt = view.findViewById(R.id.cocktailDetail_instruction);
        CocktailDatabase cocktailDatabase = CocktailDatabase.getInstance(view.getContext());
        final Cocktail cocktail = cocktailDatabase.cocktailDao().findCocktailById(idDrink);

        cocktailDetail_drinkNameTxt.setText(cocktail.getStrDrink());
        cocktailDetail_glassTypeTxt.setText(cocktail.getStrGlass());
        cocktailDetail_ing1Txt.setText(cocktail.getStrIngredient1());
        cocktailDetail_meas1Txt.setText(cocktail.getStrMeasure1());
        String ing2 = cocktail.getStrIngredient2();
        if(ing2 != null){
            cocktailDetail_ing2Txt.setText(ing2);
        }else{
            cocktailDetail_ing2Txt.setVisibility(View.INVISIBLE);
        }
        String ing3 = cocktail.getStrIngredient3();
        if(ing3 != null){
            cocktailDetail_ing3Txt.setText(ing3);
        }else{
            cocktailDetail_ing3Txt.setVisibility(View.INVISIBLE);
        }
        String ing4 = cocktail.getStrIngredient4();
        if(ing4 != null){
            cocktailDetail_ing4Txt.setText(ing4);
        }else{
            cocktailDetail_ing4Txt.setVisibility(View.INVISIBLE);
        }
        String ing5 = cocktail.getStrIngredient5();
        if(ing5 != null){
            cocktailDetail_ing5Txt.setText(ing5);
        }else{
            cocktailDetail_ing5Txt.setVisibility(View.INVISIBLE);
        }
        String ing6 = cocktail.getStrIngredient6();
        if(ing6 != null){
            cocktailDetail_ing6Txt.setText(ing6);
        }else{
            cocktailDetail_ing6Txt.setVisibility(View.INVISIBLE);
        }
        String meas2 = cocktail.getStrMeasure2();
        if(meas2 != null){
            cocktailDetail_meas2Txt.setText(meas2);
        }else{
            cocktailDetail_meas2Txt.setVisibility(View.INVISIBLE);
        }
        String meas3 = cocktail.getStrMeasure3();
        if(meas3 != null){
            cocktailDetail_meas3Txt.setText(meas3);
        }else{
            cocktailDetail_meas3Txt.setVisibility(View.INVISIBLE);
        }
        String meas4 = cocktail.getStrMeasure4();
        if(meas4 != null){
            cocktailDetail_meas4Txt.setText(meas4);
        }else{
            cocktailDetail_meas4Txt.setVisibility(View.INVISIBLE);
        }
        String meas5 = cocktail.getStrMeasure5();
        if(meas5 != null){
            cocktailDetail_meas5Txt.setText(meas5);
        }else{
            cocktailDetail_meas5Txt.setVisibility(View.INVISIBLE);
        }
        String meas6 = cocktail.getStrMeasure6();
        if(meas6 != null){
            cocktailDetail_meas6Txt.setText(meas6);
        }else{
            cocktailDetail_meas6Txt.setVisibility(View.INVISIBLE);
        }
        cocktailDetail_instructionTxt.setText(cocktail.getStrInstructions());
        String imageUrl = cocktail.getStrDrinkThumb();
        if(imageUrl != null){
            Glide.with(view.getContext()).load(imageUrl).into(cocktailDetail_imageView);
        }else{
            Glide.with(view.getContext()).load(R.drawable.cocktails).into(cocktailDetail_imageView);
        }
        return view;
    }

}
