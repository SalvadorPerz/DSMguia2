package com.aj.guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().addObserver(new MyLifeCycleObserver());
        setContentView(R.layout.activity_main);
        TextView miTexto = new TextView(this);
        miTexto.setText("Hola Alumno!! Qué tal estáis");
        setContentView(miTexto);
    }
}