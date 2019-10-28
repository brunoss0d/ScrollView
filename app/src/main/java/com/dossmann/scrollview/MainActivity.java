package com.dossmann.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add_view_buton = findViewById(R.id.addView);
        final LinearLayout linear_layout = findViewById(R.id.linear_layout01);

        add_view_buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text_view = new TextView(MainActivity.this);
                text_view.setText("Hello");
                linear_layout.addView(text_view);
            }
        });

    }
}
