package com.example.activitylifecyclecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.counter);

        if (savedInstanceState != null) {
            output.setText(savedInstanceState.getString("reply_text"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("reply_text", Integer.toString(count));
    }


    public void updatecount(View view) {
        count++;
        if(output != null){
            output.setText(Integer.toString(count));
        }

    }
}
