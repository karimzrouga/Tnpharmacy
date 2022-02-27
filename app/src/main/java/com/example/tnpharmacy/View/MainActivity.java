package com.example.tnpharmacy.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tnpharmacy.R;

public class MainActivity extends AppCompatActivity {
    private Button btn_singin , btn_singup ;
    Intent IN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        this.btn_singin = (Button) findViewById(R.id.singin);
        this.btn_singin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Singin.class);
                view.getContext().startActivity(intent);}
        });
        this.btn_singup = (Button) findViewById(R.id.singup);
        this.btn_singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Singup.class);
                view.getContext().startActivity(intent);}
        });
    }
}