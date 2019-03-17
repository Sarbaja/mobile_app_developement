package com.example.ImplicitIntentChallange;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;
    private TextView first_item;
    private TextView second_item;
    private TextView third_item;
    private TextView fourth_item;
    private TextView fifth_item;
    private TextView sixth_item;
    private TextView seventh_item;
    private TextView eight_item;
    private TextView ninth_item;
    private TextView tenth_item;
    private TextView main_text;
    private int count=0;
    private EditText LocationEditText;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_item = findViewById(R.id.item1);
        second_item = findViewById(R.id.item2);
        third_item= findViewById(R.id.item3);
        fourth_item= findViewById(R.id.item4);
        fifth_item= findViewById(R.id.item5);
        sixth_item= findViewById(R.id.item6);
        seventh_item= findViewById(R.id.item7);
        eight_item= findViewById(R.id.item8);
        ninth_item= findViewById(R.id.item9);
        tenth_item= findViewById(R.id.item10);
        main_text= findViewById(R.id.main);
        LocationEditText = findViewById(R.id.store_name);

        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {
                main_text.setVisibility(View.VISIBLE);
                first_item.setText(savedInstanceState.getString("reply_text"));
                first_item.setVisibility(View.VISIBLE);
            }
        }

    }


    public void launchsecondactivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);

                if(count == 0){
                    main_text.setVisibility(View.VISIBLE);
                    first_item.setText(reply);
                    first_item.setVisibility(View.VISIBLE);
                    count++;
                }
                else if (count == 1){
                    second_item.setText(reply);
                    second_item.setVisibility(View.VISIBLE);
                    count++;
                }
                else if(count == 2){
                    third_item.setText(reply);
                    third_item.setVisibility(View.VISIBLE);
                    count++;
                }
                else if(count == 3){
                    fourth_item.setText(reply);
                    fourth_item.setVisibility(View.VISIBLE);
                    count++;
                }
                else if(count == 4){
                    fifth_item.setText(reply);
                    fifth_item.setVisibility(View.VISIBLE);
                    count++;
                }
                else if(count == 5){
                    sixth_item.setText(reply);
                    sixth_item.setVisibility(View.VISIBLE);
                    count++;
                }
                else if(count == 6){
                    seventh_item.setText(reply);
                    seventh_item.setVisibility(View.VISIBLE);
                    count++;
                }
                else if(count == 7){
                    eight_item.setText(reply);
                    eight_item.setVisibility(View.VISIBLE);
                    count++;
                }
                else if(count == 8){
                    ninth_item.setText(reply);
                    ninth_item.setVisibility(View.VISIBLE);
                    count++;
                }
                else if(count == 9){
                    tenth_item.setText(reply);
                    tenth_item.setVisibility(View.VISIBLE);
                    count++;
                }

            }
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (main_text.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text",first_item.getText().toString());
        }
    }

    public void openloc(View view) {

        String loc = LocationEditText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }

    }
}
