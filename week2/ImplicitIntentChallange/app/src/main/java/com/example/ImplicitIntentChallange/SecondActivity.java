package com.example.ImplicitIntentChallange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button apple;
    private Button strawberry;
    private Button mango;
    private Button orange;
    private Button cheese;
    private Button roll;
    private Button pizza;
    private Button juice;
    private Button cornflakes;
    private Button honey;

    private String reply;
    public static final String EXTRA_REPLY = "com.example.android.ImplicitIntentChallange.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        apple = findViewById(R.id.apple);
        strawberry = findViewById(R.id.strawberry);
        mango = findViewById(R.id.mango);
        orange = findViewById(R.id.orange);
        cheese =  findViewById(R.id.cheese);
        roll = findViewById(R.id.roll);
        pizza = findViewById(R.id.pizza);
        juice = findViewById(R.id.juice);
        cornflakes = findViewById(R.id.cornflakes);
        honey = findViewById(R.id.honey);
    }

    public void addtocart(View view) {

        switch(view.getId()){
            case R.id.apple:
                reply = apple.getText().toString();
                break;

            case R.id.strawberry:
                reply = strawberry.getText().toString();
                break;

            case R.id.mango:
                reply = mango.getText().toString();
                break;

            case R.id.orange:
                reply = orange.getText().toString();
                break;

            case R.id.cheese:
                reply = cheese.getText().toString();
                break;

            case R.id.roll:
                reply = roll.getText().toString();
                break;

            case R.id.pizza:
                reply = pizza.getText().toString();
                break;

            case R.id.juice:
                reply = juice.getText().toString();
                break;

            case R.id.cornflakes:
                reply = cornflakes.getText().toString();
                break;

            case R.id.honey:
                reply = honey.getText().toString();
                break;

        }

        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();

    }
}
