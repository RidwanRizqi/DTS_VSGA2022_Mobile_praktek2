package com.example.dts_praktek2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn_oke = findViewById(R.id.btn_ok);
        btn_oke.setOnClickListener(view -> btn_oke.setBackgroundColor(Color.RED));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu1) {
            startActivity(new Intent(this, Menu1.class));
        } else if (item.getItemId() == R.id.menu2) {
            startActivity(new Intent(this, Menu2.class));
        } else if (item.getItemId() == R.id.menu3) {
            startActivity(new Intent(this, Menu3.class));
        }
        return true;
    }
}