package com.example.arafat.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class chekck extends AppCompatActivity {

    Button show;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chekck);

        show = findViewById(R.id.button3);
        textView = findViewById(R.id.textView2);

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);

        String name = sharedPreferences.getString("name", null);
        textView.setText(name);
    }
}
