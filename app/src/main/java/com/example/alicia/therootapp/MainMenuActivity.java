package com.example.alicia.therootapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        //Add a listener to the button to take you to the temp converter
        Button btnCategory = (Button) findViewById(R.id.btnCategory);
        btnCategory.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               goCategory();
                                           }
                                       }
        );
        Button btnAuthor = (Button) findViewById(R.id.btnAuthor);
        btnAuthor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                goAuthor();
            }
        });
    }

    private void goCategory() {
        Intent intent = new Intent(MainMenuActivity.this, CategoryActivity.class);
        this.startActivity(intent);
    }

    private void goAuthor() {
        Intent intent = new Intent(MainMenuActivity.this, AuthorActivity.class);
        this.startActivity(intent);
    }
}