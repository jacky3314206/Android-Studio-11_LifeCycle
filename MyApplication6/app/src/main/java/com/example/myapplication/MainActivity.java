package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate: ");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MainActivity", "onStart: ");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume: ");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart: ");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause: ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop: ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy: ");
    }
    public void GOTOB(View view) {
        TextView msg = (TextView)findViewById(R.id.textView);
        EditText editText = (EditText)findViewById(R.id.editTextTextPersonName);
        Intent intent = new Intent(this,MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("msg",msg.getText().toString());
        bundle.putString("name",editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
        Log.d("MainActivity:", "GOTOB: ");
    }
}