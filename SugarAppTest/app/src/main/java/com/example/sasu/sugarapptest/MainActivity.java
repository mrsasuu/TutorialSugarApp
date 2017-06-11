package com.example.sasu.sugarapptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etID, eTNombre, etTelefono,etContra;
    Button btnGuardar, btnConsultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = (EditText) findViewById(R.id.ediId);
        eTNombre = (EditText) findViewById(R.id.ediNombre);
        etTelefono = (EditText) findViewById(R.id.ediTel);
        etContra = (EditText) findViewById(R.id.ediContr);

        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        btnConsultar = (Button) findViewById(R.id.btnConsultar);



    }

    public void guardar(View v){

        Registro r = new Registro(etID.getText().toString(),eTNombre.getText().toString(),etTelefono.getText().toString(),etContra.getText().toString());

        r.save();
    }

    public void consultar(View v){
        List<Registro> registros = Registro.find(Registro.class,"ide = ?", etID.getText().toString() );
        Registro r = registros.get(0);

        eTNombre.setText(r.getNombre());
        etTelefono.setText(r.getTelefono());
        etContra.setText(r.getContrase());
    }
}
