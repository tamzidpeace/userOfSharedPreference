package com.example.arafat.sharedpreference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    SharedPreferences pref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        Button save, show, go;
        save = findViewById(R.id.button);
        show = findViewById(R.id.button2);
        go = findViewById(R.id.button4);

        pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showData();
            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, chekck.class));
            }
        });

    }

    private void saveData() {
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name", "arafat");
        editor.apply();
    }

    private void showData() {
        String name = pref.getString("name", null);
        textView.setText(name);
    }
}
