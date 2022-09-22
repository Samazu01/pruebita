package com.example.lab4;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
   private RadioButton rb1,rb2,rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.oso);
                Toast.makeText(getApplicationContext(), "Oso Polar", Toast.LENGTH_SHORT).show();
                }
            });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.leopardo);
                Toast.makeText(getApplicationContext(), "Leopardo de las Nieves", Toast.LENGTH_SHORT).show();
            }

        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.pajaro);
                Toast.makeText(getApplicationContext(), "Pico zapatos", Toast.LENGTH_SHORT).show();
            }

        });
    }
}