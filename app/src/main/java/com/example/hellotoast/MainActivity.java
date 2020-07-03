package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button resetButton;
    private Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        resetButton = (Button) findViewById(R.id.button_zero);
        countButton = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view){
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        if (mCount % 2 == 1)
            countButton.setBackgroundColor(Color.parseColor("#336DFF"));
        else
            countButton.setBackgroundColor(Color.parseColor("#51D703"));
    }

    public void resetZero(View view){
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        resetButton.setBackgroundColor(Color.parseColor("#808080"));
    }
}