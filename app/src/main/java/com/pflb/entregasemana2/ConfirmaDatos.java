package com.pflb.entregasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmaDatos extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFdn;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirma_datos);

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvFdn = (TextView) findViewById(R.id.tvFdn);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);

        String nombre = getIntent().getStringExtra("nombre");
        tvNombre.setText(nombre);
        String fdn = getIntent().getStringExtra("fdn");
        tvFdn.setText(fdn);
        String telefono = getIntent().getStringExtra("telefono");
        tvTelefono.setText(telefono);
        String email = getIntent().getStringExtra("email");
        tvEmail.setText(email);
        String descripcion = getIntent().getStringExtra("descripcion");
        tvDescripcion.setText(descripcion);
    }

    //Método para botón "Editar datos"

    public void Editar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}