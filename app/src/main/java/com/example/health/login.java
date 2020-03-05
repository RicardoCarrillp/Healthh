package com.example.health;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = findViewById(R.id.editText2);
        pass = findViewById(R.id.editText);
    }
    public void iniciar(View v) {
        //Toast.makeText(getApplicationCo ntext(), "On click mi perro", Toast.LENGTH_SHORT).show();

        Intent i=new Intent( this, examen.class);
        startActivity(i);

    }
    public void Show(View v){

        AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
        builder.setIcon(R.mipmap.ic_launcher).
                setTitle("Informacion de inicio de sesión").
                setMessage("Usuario: " + user.getText().toString() + "\nContraseña: " + pass.getText().toString());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();





    }



}
