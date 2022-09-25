package com.example.calcarearange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular();
    }

    public void calcular() {
        //buscando pela altura, largura e resposta
        final SeekBar s_width = (SeekBar) findViewById(R.id.w_slide);
        final SeekBar s_height = (SeekBar) findViewById(R.id.h_slide);
        final TextView area_view = (TextView) findViewById(R.id.area_text);

        SeekBar.OnSeekBarChangeListener listener = new SeekBar.OnSeekBarChangeListener() {

            @Override
            //evento de mudança do progresso
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                int width = (int) s_width.getProgress();
                int height = (int) s_height.getProgress();
                area_view.setText("Área = " + width*height);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        };
        s_height.setOnSeekBarChangeListener(listener);
        s_width.setOnSeekBarChangeListener(listener);
    }
}
