package com.example.miniactivitat2;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        String message = readData();

        TextView result = (TextView)findViewById(R.id.textView4);
        result.setText("Result:");

        TextView resultData = (TextView)findViewById(R.id.textView5);
        resultData.setText(message);

        Button button = (Button)findViewById(R.id.button2);
        button.setText("Go back");
        button.setOnClickListener(new GoBack(message));
    }

    //Method to read bundle from intent created on previous activity
    private String readData() {
        Bundle data = this.getIntent().getExtras();
        String message = data.getString("message");
        int num_reps = data.getInt("num_reps");

        String result = "";
        for(int i=0; i<num_reps; ++i) {
            result += message;
        }

        return result;
    }

    private class GoBack implements View.OnClickListener {
        String message;

        public GoBack(String message) {
            this.message = message;
        }

        //Task to do when press GO BACK button
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("message", this.message);
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}
