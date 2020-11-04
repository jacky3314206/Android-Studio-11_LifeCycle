package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("MainActivity2", "onCreate: ");
        a();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MainActivity2", "onStart: ");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity2", "onResume: ");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity2", "onRestart: ");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity2", "onPause: ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity2", "onStop: ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity2", "onDestroy: ");
    }
    private void a(){
        Bundle bundle = this.getIntent().getExtras();
        String x = bundle.getString("msg");
        String y = bundle.getString("name");
        TextView textView = (TextView)findViewById(R.id.textView2);
        TextView textView1 = (TextView)findViewById(R.id.textView3);
        textView.setText(x);
        textView1.setText(y);
        Log.d("MainActivity2:", "a: ");
    }
}