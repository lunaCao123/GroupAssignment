package com.example.barbootcamp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.barbootcamp.R;

public class ChooseUserTypeActivity extends AppCompatActivity {
    public TextView userType_userNameText;
    public ImageView userType_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_user_type);

        userType_userNameText = findViewById(R.id.userTypePage_userNameText);
        String user = MainActivity.userName;
        userType_userNameText.setText(user);
        userType_image = findViewById(R.id.userTypePage_image);
        userType_image.setImageResource(R.drawable.ic_cocktail_glass_with_lemon_slice_svgrepo_com);

    }
    public void setFunBtnAction(View view){
        Intent intent = new Intent(this, FunActivityHomepage.class);
        startActivity(intent);
    }
    public void setBartenderBtnAction(View view){
        Intent intent = new Intent(this, BartenderLearningHomepage.class);
        startActivity(intent);
    }
}
