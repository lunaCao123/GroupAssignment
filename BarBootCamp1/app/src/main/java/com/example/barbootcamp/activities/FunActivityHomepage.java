package com.example.barbootcamp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.barbootcamp.R;
import com.example.barbootcamp.fragments.CocktailFavouriteFragment;
import com.example.barbootcamp.fragments.CocktailRecyclerFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FunActivityHomepage extends AppCompatActivity {

    BottomNavigationView cocktailBottomNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_homepage);
        Fragment fragment1 = new CocktailRecyclerFragment();
        swapFragment(fragment1);

        cocktailBottomNavView = findViewById(R.id.cocktail_bottomNav);
        cocktailBottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.nav_search) {
                    Fragment fragment1 = new CocktailRecyclerFragment();
                    swapFragment(fragment1);
                    return true;
                } else if (menuItem.getItemId() == R.id.nav_fav) {
                    Fragment fragment1 = new CocktailFavouriteFragment();
                    swapFragment(fragment1);
                    return true;
                }
                return false;
            }
        });
    }

    /**
     * Helper method to change the fragment displayed in the activity. We put this here so we don't
     * have to repeat the code every time we want to saw
     *
     * @param fragment: instance of the fragment to go into the slot
     */
    private void swapFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.cocktail_fragmentslot, fragment);
        fragmentTransaction.commit();
    }

}
