package com.example.hesapmakinesi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import org.mariuszgromada.math.mxparser.*;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.editViewPart);
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.display).equals(display.getText().toString())) {
                    display.setText("");
                }
            }
        });

    }

    private void updateText(String newStr) {
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if (getString(R.string.display).equals(display.getText().toString())) {
            display.setText(newStr);
            display.setSelection(cursorPos + 1);
        } else {
            display.setText(String.format("%s%s%s", leftStr, newStr, rightStr));
            display.setSelection(cursorPos + 1);
        }

    }

    public void oneButton(View v) {
        updateText("1");
    }
    public void twoButton(View v) {
        updateText("2");
    }
    public void threeButton(View v) {
        updateText("3");
    }
    public void fourButton(View v) {
        updateText("4");
    }
    public void fiveButton(View v) {
        updateText("5");
    }
    public void sixButton(View v) {
        updateText("6");
    }
    public void sevenButton(View v) {
        updateText("7");
    }
    public void eightButton(View v) {
        updateText("8");
    }
    public void nineButton(View v) {
        updateText("9");
    }
    public void zeroButton(View v) {
        updateText("0");
    }
    public void clearButton(View v) {
        display.setText("");
    }
    public void backspaceButton(View v) {
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();
        if (cursorPos != 0 && textLen != 0) {
            String oldStr = display.getText().toString();
            String leftStr = oldStr.substring(0, cursorPos - 1);
            String rightStr = oldStr.substring(cursorPos);
            display.setText(String.format("%s%s", leftStr, rightStr));
            display.setSelection(cursorPos - 1);
        }
    }
    public void addButton(View v) {
        updateText("+");
    }
    public void subtractionButton(View v) {
        updateText("-");
    }
    public void multiplyButton(View v) {
        updateText("*");
    }
    public void divideButton(View v) {
        updateText("/");
    }
    public void equals_toButton(View v) {
        String userExp = display.getText().toString();

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());
        display.setText(result);
        display.setSelection(result.length());
    }
    public void plusMinusButton(View v) {
        updateText("-");
    }


}