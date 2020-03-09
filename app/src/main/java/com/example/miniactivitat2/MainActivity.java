package com.example.miniactivitat2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
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
        button.setOnClickListener(new Concatenate(intro_message, intro_reps));
    }

    private class Concatenate implements View.OnClickListener {

        EditText editText;
        EditText editText2;

        public Concatenate(EditText editText, EditText editText2) {
            this.editText = editText;
            this.editText2 = editText2;
        }

        @Override
        public void onClick(View v) {
            String message = this.editText.getText().toString();
            String reps = this.editText2.getText().toString();

            //Control de errores
            if(message.isEmpty()) {
                message = "Bye";
            }
            if(reps.isEmpty()) {
                reps = "1";
            }
            int num_reps = Integer.parseInt(reps);

            //Intent para ejecutar la segunda actividad
            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            i.putExtra("message", message);
            i.putExtra("num_reps", num_reps);
            startActivityForResult(i, 1);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    }
}
