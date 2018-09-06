package com.idegroup.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    private TextView numberTextView;
    private Button counterButton;
    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);


        /*initialize all widgets:*/

        numberTextView = findViewById(R.id.numberTextView);
        counterButton = findViewById(R.id.counterButton);

        /*make counter to increment the number in the screen:*/
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number += 1;
                String result = number + "";
                numberTextView.setText(result);
            }
        };
        counterButton.setOnClickListener(listener);
    }
}
