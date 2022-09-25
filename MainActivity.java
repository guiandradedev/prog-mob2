package com.example.calcarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular();
    }

    public void calcular() {
        Button botaoCalculaArea = (Button) findViewById(R.id.botaoCalculaArea);
        botaoCalculaArea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //definindo altura
                final EditText inputAltura = (EditText) findViewById(R.id.inputAltura);
                double alturaDecimal = Double.parseDouble(inputAltura.getText().toString());

                //definindo largura
                final EditText inputLargura = (EditText) findViewById(R.id.inputLargura);
                double larguraDecimal = Double.parseDouble(inputLargura.getText().toString());

                //formatação do número
                DecimalFormat df = new DecimalFormat("#.#");

                //gerando o valor
                double areaDecimal = Double.parseDouble(df.format(alturaDecimal * larguraDecimal));

                //printando o valor
                final EditText outputArea = (EditText) findViewById(R.id.outputArea);
                outputArea.setText(Double.toString(areaDecimal));
            }
        });
    }
}
