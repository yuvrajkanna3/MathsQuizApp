package com.example.mathsquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    CheckBox checkbox1;
    CheckBox checkbox2;
    CheckBox checkbox3;
    CheckBox checkbox4;
    RadioButton button1;
    RadioButton button2;
    RadioButton button3;
    RadioButton button4;
    RadioButton button5;
    RadioButton button6;
    RadioButton button7;
    RadioButton button8;
    String name;
    EditText text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void button(View view) {
        text = findViewById(R.id.name_text);
        name = text.getText().toString();
        scoreText(score, name);

    }

    public void scoreText(int final_score, String name) {
        TextView textView = findViewById(R.id.score_id_text);
        textView.setText(name + " " +
                "Score is : " + final_score );
    }

    public void onRadioButtonClicked(View view) {
        button1 = findViewById(R.id.radio_button_1);
        button2 = findViewById(R.id.radio_button_2);
        button3 = findViewById(R.id.radio_button_3);
        button4 = findViewById(R.id.radio_button_4);
        button5 = findViewById(R.id.radio_button_5);
        button6 = findViewById(R.id.radio_button_6);
        button7 = findViewById(R.id.radio_button_7);
        button8 = findViewById(R.id.radio_button_8);

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_button_1:
                if (checked)
                    score = score + 1;
                break;
            case R.id.radio_button_2:
                if (checked)
                    score = score + 0;
                break;
            case R.id.radio_button_3:
                if (checked)
                    score = score + 0;
                break;
            case R.id.radio_button_4:
                if (checked)
                    score = score + 1;
                break;
            case R.id.radio_button_5:
                if (checked)
                    score = score + 0;
                break;
            case R.id.radio_button_6:
                if (checked)
                    score = score + 1;
                break;
            case R.id.radio_button_7:
                if (checked)
                    score = score + 0;
                break;
            case R.id.radio_button_8:
                if (checked)
                    score = score + 1;
                break;
        }

    }


    public void checkBox(View view) {
        checkbox1 = findViewById(R.id.checkbox1);
        checkbox2 = findViewById(R.id.checkbox2);
        checkbox3 = findViewById(R.id.checkbox3);
        checkbox4 = findViewById(R.id.checkbox4);
        if (checkbox1.isChecked() && checkbox3.isChecked()) {
            score = score + 2;
        } else score = score + 0;
    }


    public void reset(View view) {
        score = 0;
        scoreText(0, "");
        setButton();
        setCheckbox();
        text.setText("");
    }

    public void setButton() {
        button1.setChecked(false);
        button2.setChecked(false);
        button3.setChecked(false);
        button4.setChecked(false);
        button5.setChecked(false);
        button6.setChecked(false);
        button7.setChecked(false);
        button8.setChecked(false);
    }

    public void setCheckbox() {
        checkbox1.setChecked(false);
        checkbox2.setChecked(false);
        checkbox3.setChecked(false);
        checkbox4.setChecked(false);
    }


}
