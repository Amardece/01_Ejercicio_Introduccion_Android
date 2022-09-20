package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Zona de definicion de Variables de tipo Vista
    private EditText txtnombre;
    private TextView lbsaludo;
    private Button btnSaludar;
    private Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // a partir de aqui

        inicializarVistas();

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtnombre.getText().toString().trim();

                if (nombre.equalsIgnoreCase("")){
                    Toast.makeText(MainActivity.this,"No hay nada escrito", Toast.LENGTH_SHORT);
                }
                else {
                    lbsaludo.setText("Hola, " + nombre + ", buenos dias");
                    txtnombre.setText("");
                }


            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lbsaludo.setText("");
            }
        });
    }

    private void inicializarVistas() {
        txtnombre = findViewById(R.id.etxtNombre);
        lbsaludo = findViewById(R.id.lbSaludoMain);
        btnSaludar =findViewById(R.id.btnSaludar);
        btnReset = findViewById(R.id.btnReset);
    }

}