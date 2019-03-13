package com.example.HelloToastIntent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activty);


        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView show = findViewById(R.id.textView3);
        show.setText(getString(R.string.toast_message));
        TextView shownum =  findViewById(R.id.textView5);
        shownum.setText(message);

    }
}
