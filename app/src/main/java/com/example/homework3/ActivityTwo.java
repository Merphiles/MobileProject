package com.example.homework3;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setMovementMethod(new ScrollingMovementMethod());
        final Spinner spinner = (Spinner) findViewById(R.id.choose);
        final ImageView imageView = (ImageView) findViewById(R.id.change);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(spinner.getSelectedItem().equals("One Piece")){
                    imageView.setImageResource(R.drawable.one_piece_poster);
                    textView.setText(R.string.one_piece_sum);
                }
                else if (spinner.getSelectedItem().equals("Gurren Lagann")){
                    imageView.setImageResource(R.drawable.gurren_lagann_poster);
                    textView.setText(R.string.gurren_sum);
                }
                else {
                    imageView.setImageResource(R.drawable.clannad_poster);
                    textView.setText(R.string.clannad_sum);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
