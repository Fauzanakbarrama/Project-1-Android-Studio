package com.example.projekpertama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count=0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
    }
    public void showtoast(View view){
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
    }
    public void countUp(View view){
        count++;
        textView.setText(count + "");
    }
}