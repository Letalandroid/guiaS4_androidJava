package com.ucheve.navegarentreactivities;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    EditText txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtResultado = findViewById(R.id.txtResultado);

        String i = getIntent().getStringExtra("result");
        txtResultado.setText(i);
    }
}