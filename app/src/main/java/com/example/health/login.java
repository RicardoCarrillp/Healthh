package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void iniciar(View v) {
        //Toast.makeText(getApplicationCo ntext(), "On click mi perro", Toast.LENGTH_SHORT).show();
        Intent i=new Intent( this, examen.class);
        startActivity(i);
    }
}
