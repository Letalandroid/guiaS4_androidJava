package com.ucheve.navegarentreactivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre;
    Spinner spnActividad;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        spnActividad = findViewById(R.id.spnActividad);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(v -> {
            goToActivity();
        });
    }

    private void goToActivity() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}