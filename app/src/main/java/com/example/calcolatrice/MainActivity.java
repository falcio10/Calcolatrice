package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button somma =(Button) findViewById(R.id.btnsomma);
        EditText v1 =(EditText) findViewById(R.id.editTextN1);
        EditText v2=(EditText) findViewById(R.id.editTextN2);
        TextView tot=(TextView) findViewById(R.id.textViewRisultato);

        somma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totale=0;
                totale=Integer.valueOf(v1.getText().toString()) + Integer.valueOf(v2.getText().toString());
                tot.setText(""+totale);
			//riprova
			//riprovaaa
			//AAAAAA

            }
        });
    }
}