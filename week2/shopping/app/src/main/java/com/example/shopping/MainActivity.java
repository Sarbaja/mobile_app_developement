package com.example.shopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final int ITEM_REQUEST = 1;
    private ArrayList<String> itemsList = new ArrayList<>(10);
    private final TextView[] item = new TextView[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item[0] = findViewById(R.id.textView);
        item[1] = findViewById(R.id.textView2);
        item[2] = findViewById(R.id.textView3);
        item[3] = findViewById(R.id.textView4);
        item[4] = findViewById(R.id.textView5);
        item[5] = findViewById(R.id.textView6);
        item[6] = findViewById(R.id.textView7);
        item[7] = findViewById(R.id.textView8);
        item[8] = findViewById(R.id.textView9);
        item[9] = findViewById(R.id.textView10);


        if(savedInstanceState !=  null){
            itemsList = savedInstanceState.getStringArrayList("ItemsListStringArray");

            int i;
            for(i=0;i< itemsList.size(); i++){
                if(itemsList.size() > 10){
                    Toast.makeText(MainActivity.this, "Cannot add more items to the cart", Toast.LENGTH_LONG).show();
                    break;
                }
                item[i].setVisibility(View.VISIBLE);
                item[i].setText(itemsList.get(i));
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        if(itemsList.size() != 0){
            outState.putStringArrayList("ItemsListStringArray", itemsList);
        }
    }

    public void launchsecondactivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, ITEM_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == ITEM_REQUEST){
            if(resultCode == RESULT_OK){
                String itemString = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                itemsList.add(itemString);

                int i;
                for(i=0;i< itemsList.size(); i++){
                    if(itemsList.size() > 10){
                        Toast.makeText(MainActivity.this, "Cannot add more items to the cart", Toast.LENGTH_LONG).show();
                        break;
                    }
                    item[i].setVisibility(View.VISIBLE);
                    item[i].setText(itemsList.get(i));
                }
            }
        }
    }



}
