package com.juan.pets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList mascotas;
    boolean bandera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miActionBar= (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        ((TextView) findViewById(R.id.toolbar_title)).setText("Dogs");

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Mascota 1",0,R.drawable.perro1));
        mascotas.add(new Mascota("Mascota 2",0,R.drawable.perro2));
        mascotas.add(new Mascota("Mascota 3",0,R.drawable.perro3));
        mascotas.add(new Mascota("Mascota 4",0,R.drawable.perro4));
        mascotas.add(new Mascota("Mascota 5",0,R.drawable.perro5));
        mascotas.add(new Mascota("Mascota 6",0,R.drawable.perro6));
        mascotas.add(new Mascota("Mascota 7",0,R.drawable.perro7));


        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);


        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);

        RVAdapter adapter = new RVAdapter(mascotas);
        rv.setAdapter(adapter);


    }

    public void irDetalle(View v){
        Intent intent= new Intent(this,Detalle.class);
        startActivity(intent);

    }

}