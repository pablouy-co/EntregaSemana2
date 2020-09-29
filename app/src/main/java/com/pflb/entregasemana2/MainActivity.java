package com.pflb.entregasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    //objetos
    private EditText formNombre;
    //private EditText formFecha;
    private EditText formTelefono;
    private EditText formEmail;
    private EditText formDescripcion;


    //private BreakIterator displayDate;
    //String Fecha = displayDate.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formNombre      = (EditText) findViewById(R.id.formNombre);
        //formFecha       = (EditText) findViewById(R.id.formFecha);
        formTelefono    = (EditText) findViewById(R.id.formTelefono);
        formEmail       = (EditText) findViewById(R.id.formEmail);
        formDescripcion = (EditText) findViewById(R.id.formDescripcion);

        String nombre = getIntent().getStringExtra("nombre");
        formNombre.setText(nombre);
        String telefono = getIntent().getStringExtra("telefono");
        formNombre.setText(telefono);
        String email = getIntent().getStringExtra("email");
        formEmail.setText(email);
        String descripcion = getIntent().getStringExtra("descripcion");
        formEmail.setText(descripcion);

    }

    //Método para el botón "Siguiente"

    public void Siguiente(View view){
        Intent i = new Intent(this, ConfirmaDatos.class);
        i.putExtra("nombre", formNombre.getText().toString());
        //i.putExtra("fdn", formFecha.getText().toString());
        i.putExtra("telefono", formTelefono.getText().toString());
        i.putExtra("email", formEmail.getText().toString());
        i.putExtra("descripcion", formDescripcion.getText().toString());
        startActivity(i);

    }
}