package com.christopherdmark.mathsample2;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonPLay = (Button)findViewById(R.id.buttonPlay);

        buttonPLay.setOnClickListener(this);

    }

    @Override
        public void onCLick(View view) {
            Intent i;
            i = new Intent(this, GameActivity.class);
            startActivity(i);
    }


}
