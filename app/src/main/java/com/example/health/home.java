package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.health.MainActivity;
import com.example.health.R;
import com.example.health.login;

public class home extends AppCompatActivity implements View.OnClickListener{
Button homeS,homeR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



    }

    @Override
    public void onClick(View v) {
        //Toast.makeText(getApplicationCo ntext(), "On click mi perro", Toast.LENGTH_SHORT).show();
        Intent i=new Intent(home.this, login.class);
        startActivity(i);
    }
}
