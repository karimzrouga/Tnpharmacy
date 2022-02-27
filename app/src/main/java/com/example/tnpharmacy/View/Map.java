package com.example.tnpharmacy.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.tnpharmacy.R;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Bundle extra = this.getIntent().getExtras();
if (extra != null )
{
    Toast.makeText(this, extra.getString("user").toString(), Toast.LENGTH_LONG).show();

}

    }
}