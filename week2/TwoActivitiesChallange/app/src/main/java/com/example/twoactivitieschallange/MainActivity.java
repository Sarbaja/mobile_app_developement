package com.example.twoactivitieschallange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class
MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivitieschallange.extra.MESSAGE";
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        switch(view.getId()){
            case  R.id.button:
                view.setBackgroundResource(R.color.colorAccent);
                text = getString(R.string.first_paragraph);
                intent.putExtra(EXTRA_MESSAGE, text);
                startActivity(intent);
                break;

            case R.id.button2:
                view.setBackgroundResource(R.color.colorPrimary
                );
                text = getString(R.string.second_paragraph);
                intent.putExtra(EXTRA_MESSAGE, text);
                startActivity(intent);
                break;

            case R.id.button3:
                view.setBackgroundResource(R.color.colorAccent);
                text = getString(R.string.third_paragraph);
                intent.putExtra(EXTRA_MESSAGE, text);
                startActivity(intent);
                break;
        }
    }
}
