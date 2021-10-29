package org.iesfm.proyectactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent pantallaPrincipal = getIntent();
        String name = pantallaPrincipal.getStringExtra(MainActivity.PROYECT_ACTIVITIES_NAME);
        TextView tvName = (TextView) findViewById(R.id.tvName);
        tvName.setText("Hola " + name);
    }

    public void cambiarActividad(View v) {
        Intent pantallaPrincipal = new Intent(this, MainActivity.class);
        startActivity(pantallaPrincipal);
    }
}