package com.example.simpleinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText et1;
    EditText et2;
    EditText et3;
    Button bt1;
    TextView v1;
    Float p,i,r,c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.amount);
        et2=findViewById(R.id.intr);
        et3=findViewById(R.id.year);
        bt1=findViewById(R.id.cal);
        v1=findViewById(R.id.View);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                p=Float.parseFloat(et1.getText().toString());
                i=Float.parseFloat(et2.getText().toString());
                r=Float.parseFloat(et3.getText().toString());

                c=(p*i*r)/100;

                v1.setText(String.valueOf(c));

            }
        });
    }
}
