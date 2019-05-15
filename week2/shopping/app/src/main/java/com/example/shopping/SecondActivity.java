package com.example.shopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.shopping.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void addItem(View view) {

            Intent replyIntent = new Intent();
            Button b = (Button)view;
            String name = b.getText().toString();
            replyIntent.putExtra(EXTRA_REPLY, name);
            setResult(RESULT_OK, replyIntent);
            finish();

        }

    }
