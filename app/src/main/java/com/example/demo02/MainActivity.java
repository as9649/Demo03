package com.example.demo02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setText("Click me!");

    }
    int mone=0;
    public void Go(View view) {
        mone++;
        btn.setText("This is a click number: "+mone);
        if (mone>=6){
            btn.setText("Enough to click. Go to new start!");
            mone=0;
        }
    }
}