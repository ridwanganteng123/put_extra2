package com.example.put_extra2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t =(TextView)findViewById(R.id.ngatext_viewdata);
        Bundle bundle=getIntent().getExtras();
        String s =bundle.getString("name");
        t.setText(s);
    }
}
