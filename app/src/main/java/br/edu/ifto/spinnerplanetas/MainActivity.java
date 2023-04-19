package br.edu.ifto.spinnerplanetas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifto.spinnerplanetas.adapters.PlanetaAdapter;
import br.edu.ifto.spinnerplanetas.entidades.Planeta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Planeta> planetas = new ArrayList<>();
        planetas.add(new Planeta("Mercúrio",R.drawable.mercurio,
                R.string.mercurio_texto));
        planetas.add(new Planeta("Vênus",R.drawable.venus,
                R.string.venus_texto));
        planetas.add(new Planeta("Terra",R.drawable.terra,
                R.string.terra_texto));
        planetas.add(new Planeta("Marte",R.drawable.marte,
                R.string.marte_texto));
        planetas.add(new Planeta("Júpiter",R.drawable.jupiter,
                R.string.jupiter_texto));
        planetas.add(new Planeta("Saturno",R.drawable.saturno,
                R.string.saturno_texto));
        planetas.add(new Planeta("Urano",R.drawable.urano,
                R.string.urano_texto));
        planetas.add(new Planeta("Netuno",R.drawable.netuno,
                R.string.netuno_texto));
        planetas.add(new Planeta("Plutão",R.drawable.plutao,
                R.string.plutao_texto));

        Spinner spinnerPlanetas = findViewById(R.id.spinnerPlanetas);
        TextView nomePlaneta = findViewById(R.id.nomePlaneta);
        ImageView imagemPlaneta = findViewById(R.id.imagemPlaneta);
        TextView textoPlaneta = findViewById(R.id.textoPlaneta);

        PlanetaAdapter adapterPlanetas =
                new PlanetaAdapter(this,
                        android.R.layout.simple_spinner_item,
                        planetas);
        adapterPlanetas.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerPlanetas.setAdapter(adapterPlanetas);
        spinnerPlanetas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i,
                                       long l) {
                Planeta selectedPlaneta = (Planeta)
                        spinnerPlanetas.getSelectedItem();
                nomePlaneta.setText(selectedPlaneta.getNome());
                imagemPlaneta.setImageResource(selectedPlaneta.getImagem());
                textoPlaneta.setText(selectedPlaneta.getTexto());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}