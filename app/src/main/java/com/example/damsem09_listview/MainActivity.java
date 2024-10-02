package com.example.damsem09_listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView lista;
        List<String> estudiantes;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // 1. Conectamos nuestro listView a lista a través del id
        lista = findViewById(R.id.listView);
        // 2. Instanciamos la Lista y agregamos elementos
        estudiantes = new ArrayList<>();
        estudiantes.add("Caballero");
        estudiantes.add("Cañazaca");
        estudiantes.add("Valdivieso");
        estudiantes.add("Flores");
        estudiantes.add("Bonifacio");
        estudiantes.add("...");

        // 3. Definir el Adaptador
        ArrayAdapter adaptadorEstudiantes = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                estudiantes
        );
        // 4. Vinculamos el Adaptador con el listView
        lista.setAdapter(adaptadorEstudiantes);



    }
}