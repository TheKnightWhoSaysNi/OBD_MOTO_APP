package com.example.obd_moto_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private TextView engineRPMView;
    private Button button;
    float num1 = 3.1415f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        engineRPMView = findViewById(R.id.engineRPMView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                engineRPMView.setText(String.valueOf(num1));
                num1 += 1;
            }
        });
    }
}