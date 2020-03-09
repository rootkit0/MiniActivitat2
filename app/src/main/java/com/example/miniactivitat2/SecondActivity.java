package com.example.miniactivitat2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView result = (TextView)findViewById(R.id.textView4);
        result.setText("Result:");

        TextView resultData = (TextView)findViewById(R.id.textView5);
        resultData.setText(readData());

        Button button = (Button)findViewById(R.id.button2);
        button.setText("Go back");
    }

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
}
