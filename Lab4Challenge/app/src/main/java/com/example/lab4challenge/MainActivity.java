package com.example.lab4challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.lab4challenge.extra.TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(View view) {
        Intent intent = new Intent(this, MainActivity2.class);

//        insert some random text; got from randomtextgenerator.com
        switch (view.getId()){
            case R.id.button_one:
                intent.putExtra(EXTRA_TEXT, getString(R.string.displayText_one)); startActivity(intent);
                break;
            case R.id.button_two:
                intent.putExtra(EXTRA_TEXT, getString(R.string.displayText_two)); startActivity(intent);
                break;
            case R.id.button_three:
                intent.putExtra(EXTRA_TEXT, getString(R.string.displayText_three)); startActivity(intent);
                break;
            default:
                Toast.makeText(MainActivity.this, "There was an error", Toast.LENGTH_LONG).show();
                break;
        }
    }
}