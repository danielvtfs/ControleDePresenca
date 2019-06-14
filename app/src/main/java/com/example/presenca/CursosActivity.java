package com.example.presenca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CursosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botaoInserirCursos = findViewById(R.id.inserir_cursos);
        botaoInserirCursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CursosActivity.this, InserirEscolaActivity.class);
                startActivity(intent);
            }
        });


    }
}
