package com.example.exerccio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class Activity3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Button button3 = findViewById(R.id.button3);

        button3.setOnClickListener(view ->
            Snackbar.make(view, "Não existe a tela 4 por enquanto", Snackbar.LENGTH_LONG).show()
        );

        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra("TELA", "Tela 3");
    startService(intent);
}
}