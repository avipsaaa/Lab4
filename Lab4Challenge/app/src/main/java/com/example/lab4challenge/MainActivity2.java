package com.example.lab4challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


        private TextView displayText;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            displayText = findViewById(R.id.display_text);
            Intent intent = getIntent();
            String display = intent.getStringExtra(MainActivity.EXTRA_TEXT);
            displayText.setText(display);
        }

}