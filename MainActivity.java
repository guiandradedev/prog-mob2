
package com.example.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void openActivity(View view, Class myClass) {
        Intent intent = new Intent(this, myClass);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao1 = findViewById(R.id.buttonSegunda);
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view, SecondActivity.class);
            }
        });

        Button botao2 = findViewById(R.id.buttonSegunda);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view, ThirdActivity.class);
            }
        });
    }
}
