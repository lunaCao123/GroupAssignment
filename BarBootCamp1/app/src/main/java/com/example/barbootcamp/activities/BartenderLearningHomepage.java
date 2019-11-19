package com.example.barbootcamp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.barbootcamp.R;
import com.example.barbootcamp.fragments.ProgressPageFragment;
import com.example.barbootcamp.fragments.TopicRecyclerFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BartenderLearningHomepage extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bartender_learning_homepage);

        Fragment fragment = new TopicRecyclerFragment();
        swapFragment(fragment);

        bottomNavigationView = findViewById(R.id.bottomNav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if(menuItem.getItemId() == R.id.nav_topics){
                    Fragment fragment = new TopicRecyclerFragment();
                    swapFragment(fragment);
                    return true;
                }else if(menuItem.getItemId() == R.id.nav_progress){
                    Fragment fragment = new ProgressPageFragment();
                    swapFragment(fragment);
                    return true;

                }
                return false;
            }
        });

    }
    /**
     * Helper method to change the fragment displayed in the activity. We put this here so we don't
     * have to repeat the code every time we want to saw
     * @param fragment: instance of the fragment to go into the slot
     */
    private void swapFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentMain_slot, fragment);
        fragmentTransaction.commit();
    }

}
