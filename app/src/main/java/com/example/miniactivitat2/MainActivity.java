package com.example.miniactivitat2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView message = (TextView)findViewById(R.id.textView);
        message.setText("Message");
        EditText intro_message = (EditText)findViewById(R.id.editText);
        intro_message.setText("");

        TextView reps = (TextView)findViewById(R.id.textView2);
        reps.setText("Number of repetitions");
        EditText intro_reps = (EditText)findViewById(R.id.editText2);
        intro_reps.setText("");

        Button button = (Button)findViewById(R.id.button);
        button.setText("Concatenate messages!");
    }
}
