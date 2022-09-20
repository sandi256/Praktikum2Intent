package com.example.praktikum2intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nama;
    ImageView kucing;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.editTextTextPersonName);
        kucing = findViewById(R.id.imageView);
    }

    public void start(View view) {
        String namas = nama.getText().toString().trim();
        Toast.makeText(this, "Hello!! " +namas,  Toast.LENGTH_SHORT).show();
        kucing.setImageResource(R.drawable.foto2kucing);
    }
}