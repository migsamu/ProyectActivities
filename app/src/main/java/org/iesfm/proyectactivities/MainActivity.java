package org.iesfm.proyectactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected static final String PROYECT_ACTIVITIES_NAME = "org.iesfm.proyectactivities.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiarActividad(View v) {
        Intent pantallaSecundaria = new Intent(this, MainActivity2.class);
        EditText etName = (EditText) findViewById(R.id.etName);
        String name = etName.getText().toString();
        pantallaSecundaria.putExtra(PROYECT_ACTIVITIES_NAME, name);

        startActivity(pantallaSecundaria);
    }
}