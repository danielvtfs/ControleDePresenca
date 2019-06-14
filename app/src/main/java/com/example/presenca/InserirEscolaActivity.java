package com.example.presenca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InserirEscolaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir_escola);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button botaoAddCurso = findViewById(R.id.botao_add_curso);
        botaoAddCurso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InserirEscolaActivity.this, InternoInserirCursosActivity.class);
                startActivity(intent);
            }
        });
    }
}
