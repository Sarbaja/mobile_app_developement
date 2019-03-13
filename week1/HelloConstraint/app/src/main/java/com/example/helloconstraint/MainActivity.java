package com.example.helloconstraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mcount =0;
    private TextView mShowCount;
    private Button zeroButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zeroButton =  findViewById(R.id.zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showZero(View view) {
        zeroButton.setBackgroundResource(R.color.colorGray);
        mcount=0;
        mShowCount.setText(Integer.toString(mcount));
    }

    public void showCount(View view) {
        ++mcount;
        if(mShowCount != null)
        {
            zeroButton.setBackgroundResource(R.color.colorPrimaryDark);
            mShowCount.setText(Integer.toString(mcount));

            if(mcount % 2 == 0)
            {
                view.setBackgroundResource(R.color.colorPrimary);
            }

            else
            {
                view.setBackgroundResource(R.color.colorAccent);
            }
        }
    }
}
