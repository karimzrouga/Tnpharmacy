package com.example.tnpharmacy.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.tnpharmacy.Controllor.Loginvalidate;
import com.example.tnpharmacy.R;

public class Singin extends AppCompatActivity implements View.OnClickListener {
 private ImageButton pred_btn ;
 private Button singin_btn ;
 private EditText ed_email , ed_pass ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
        getSupportActionBar().hide();
        this.pred_btn= (ImageButton) findViewById(R.id.pred);
        this.pred_btn.setOnClickListener(this);
        this.ed_email=(EditText)findViewById(R.id.editTextEmail);
        this.ed_pass=(EditText)findViewById(R.id.editTextPassword);

        this.singin_btn= (Button) findViewById(R.id.insingin);
        this.singin_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       if (view ==this.pred_btn)
       {
           Intent HI = new Intent(this,MainActivity.class);
           startActivity(HI);
       }
        if (view ==this.singin_btn)
       {
           Loginvalidate lv = new Loginvalidate();
           if (lv.Emailvalidate( this.ed_email.getText().toString()))
           {
               Intent HI = new Intent(this,Map.class);
               HI.putExtra("user",this.ed_email.getText().toString());
               startActivity(HI);
           }
       }
    }
}