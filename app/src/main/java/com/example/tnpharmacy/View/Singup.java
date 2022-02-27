package com.example.tnpharmacy.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.tnpharmacy.R;

public class Singup extends AppCompatActivity   implements View.OnClickListener{
    private ImageButton pred_btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        getSupportActionBar().hide();
        this.pred_btn= (ImageButton) findViewById(R.id.pred);
        this.pred_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view ==this.pred_btn)
        {
            Intent HI = new Intent(this,MainActivity.class);
            startActivity(HI);
        }
    }
}