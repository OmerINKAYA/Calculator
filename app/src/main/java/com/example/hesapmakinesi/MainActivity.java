package com.example.hesapmakinesi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void oneButton(View v) {

    }

    public void twoButton(View v) {

    }
    public void threeButton(View v) {

    }
    public void fourButton(View v) {

    }
    public void fiveButton(View v) {

    }
    public void sixButton(View v) {

    }
    public void sevenButton(View v) {

    }
    public void eightButton(View v) {

    }
    public void nineButton(View v) {

    }
    public void zeroButton(View v) {

    }
    public void clearButton(View v) {

    }
    public void backspaceButton(View v) {

    }
    public void addButton(View v) {

    }
    public void subtractionButton(View v) {

    }
    public void multiplyButton(View v) {

    }
    public void divideButton(View v) {

    }
    public void equals_toButton(View v) {

    }
    public void plusMinusButton(View v) {

    }


}