package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        //Toast.makeText(getApplicationCo ntext(), "On click mi perro", Toast.LENGTH_SHORT).show();
        Intent i=new Intent( MainActivity.this, login.class);
        startActivity(i);
    }
}
