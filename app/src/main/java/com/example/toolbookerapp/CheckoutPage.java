package com.example.toolbookerapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class CheckoutPage extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout_page);
        Spinner spinnerTest1=(Spinner)findViewById(R.id.test1);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.drills, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTest1.setAdapter(adapter);
    }
}