package com.example.barbootcamp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.barbootcamp.R;
import com.example.barbootcamp.activities.ChooseUserTypeActivity;

public class MainActivity extends AppCompatActivity {
    public ImageButton startButton;
    public ImageView logoImage;
    public EditText userNameEditText;
    public static String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoImage = findViewById(R.id.welcomPage_logo);
        logoImage.setImageResource(R.drawable.ic_cocktail_glass_with_a_orange_slice_svgrepo_com);

        userNameEditText = findViewById(R.id.welcomePage_userNameEditText);


        startButton = findViewById(R.id.welcomePage_startButton);
        startButton.setImageResource(R.drawable.ic_arrow_forward_gold);

    }
    public void setStartButton(View view){
        userName = userNameEditText.getText().toString();
        Intent intent = new Intent(this, ChooseUserTypeActivity.class);
        startActivity(intent);
    }
}
