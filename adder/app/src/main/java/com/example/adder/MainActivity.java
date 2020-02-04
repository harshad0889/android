package com.example.adder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    EditText et2;
    Button bt;
    TextView t1;
    float a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editText1);
        et2=findViewById(R.id.editText2);
        bt=findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Float.parseFloat(et.getText().toString());
                b=Float.parseFloat(et.getText().toString());
                c=a+b;
                Toast.makeText(MainActivity.this,String.valueOf(c),Toast.LENGTH_LONG).show();
            }
        });
    }
}
