package com.cihan.correctorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first_screen extends AppCompatActivity {

    private Button mBtnKolay;
    private Button mBtnOrta;
    private Button mBtnZor;

    public void init(){
        mBtnKolay = findViewById(R.id.btnKolay);
        mBtnOrta = findViewById(R.id.btnOrta);
        mBtnZor = findViewById(R.id.btnZOR);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        init();


        mBtnKolay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_screen.this, MainActivity.class);
                intent.putExtra("valueNumber", "7000");
                startActivity(intent);
            }
        });

        mBtnOrta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_screen.this, MainActivity.class);
                intent.putExtra("valueNumber", "5000");
                startActivity(intent);
            }
        });

        mBtnZor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_screen.this, MainActivity.class);
                intent.putExtra("valueNumber", "2000");
                startActivity(intent);
            }
        });



    }
}