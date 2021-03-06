package com.example.HelloToastIntent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.example.android.hellotoastintent.extra.MESSAGE";

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }

    public void lauchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivty.class);
        String message = Integer.toString(mCount);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
