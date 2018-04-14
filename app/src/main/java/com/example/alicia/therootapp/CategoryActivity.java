package com.example.alicia.therootapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        //Add a listener to the buttons to take you to each page
        Button btnBeef = (Button) findViewById(R.id.btnBeef);
        btnBeef.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               goBeef(); }
                                       });
        Button btnChicken = (Button) findViewById(R.id.btnChicken);
        btnChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                goChicken();
            }
        });

        Button btnPasta = (Button) findViewById(R.id.btnPasta);
        btnPasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                goPasta();
            }
        });

        Button btnDessert = (Button) findViewById(R.id.btnDessert);
        btnDessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                goDessert();
            }
        });
    }

    private void goBeef() {
        Intent intent = new Intent(CategoryActivity.this, BeefActivity.class);
        this.startActivity(intent);
    }

    private void goChicken() {
        Intent intent = new Intent(CategoryActivity.this, ChickenActivity.class);
        this.startActivity(intent);
    }
    private void goPasta() {
        Intent intent = new Intent(CategoryActivity.this, PastaActivity.class);
        this.startActivity(intent);
    }

    private void goDessert() {
        Intent intent = new Intent(CategoryActivity.this, DessertActivity.class);
        this.startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch(item.getItemId()) {
            case R.id.mnuMain:
                startActivity(new Intent(getApplicationContext(), MainMenuActivity.class));
                return true;
            case R.id.mnuExit:
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
