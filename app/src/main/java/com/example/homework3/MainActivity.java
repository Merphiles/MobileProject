package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private CardView cardView1, cardView2, cardView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView1 = (CardView) findViewById(R.id.act1);
        cardView1.setOnClickListener(this);

        cardView2 = (CardView) findViewById(R.id.act2);
        cardView2.setOnClickListener(this);

        cardView3 = (CardView) findViewById(R.id.act3);
        cardView3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.act1 :
                i = new Intent(this, ActivityOne1.class);
                startActivity(i);
                break;
            case R.id.act2:
                i = new Intent(this, ActivityTwo.class);
                startActivity(i);
                break;
            case R.id.act3:
                i = new Intent(this, DontAskWhyIUseThis.class);
                startActivity(i);
                break;
        }

    }

}