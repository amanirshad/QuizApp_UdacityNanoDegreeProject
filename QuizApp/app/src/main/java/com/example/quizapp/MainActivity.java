package com.example.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {

        //Initializing marks secured
        int marksSecured = 0;

        //Checking answer 1
        RadioButton answer1 = (RadioButton) findViewById(R.id.answer1);
        if (answer1.isChecked()) {
            marksSecured += 25;
        }

        //Checking answer 2
        RadioButton answer2 = (RadioButton) findViewById(R.id.answer2);
        if (answer2.isChecked()) {
            marksSecured += 25;
        }

        //Checking answer 3
        EditText answer3 = (EditText) findViewById(R.id.answer3);
        String givenAnswer = answer3.getText().toString();
        if (givenAnswer.equals("TextView")) {
            marksSecured += 25;
        }

        //Checking answer 4
        CheckBox edittext = (CheckBox) findViewById(R.id.edittext);
        CheckBox textview = (CheckBox) findViewById(R.id.textview);
        CheckBox imageview = (CheckBox) findViewById(R.id.imageview);
        CheckBox smsmanager = (CheckBox) findViewById(R.id.smsmanager);

        if (edittext.isChecked() && textview.isChecked() && imageview.isChecked()) {
            if (smsmanager.isChecked()) {
                //Nothing as you chose one of the wrong options
            } else {
                marksSecured += 25;
            }
        }
        Toast.makeText(this, "Congratulations! You Scored " + marksSecured + " Out of 100.", Toast.LENGTH_LONG).show();


    }

}
