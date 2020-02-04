package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et;
    EditText et2;
    Button add;
    Button sub;
    Button mul;
    Button div;
    TextView t;
    float a =0,b=0,c=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.num1);
        et2=findViewById(R.id.num2);
        add=findViewById(R.id.b1);
        sub=findViewById(R.id.b2);
        mul=findViewById(R.id.b3);
        div=findViewById(R.id.b4);
        t=findViewById(R.id.v1);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
     switch (v.getId()) {
         case R.id.b1:
             a = Float.parseFloat(et.getText().toString());
             b = Float.parseFloat(et2.getText().toString());
             c = a + b;
              Toast.makeText(MainActivity.this,String.valueOf(c),Toast.LENGTH_LONG).show();
             t.setText(String.valueOf(c));
             break;

         case R.id.b2:
             a = Float.parseFloat(et.getText().toString());
             b = Float.parseFloat(et2.getText().toString());
             c = a - b;
             Toast.makeText(MainActivity.this,String.valueOf(c),Toast.LENGTH_LONG).show();
            t.setText(String.valueOf(c));
             break;

         case R.id.b3:
             a = Float.parseFloat(et.getText().toString());
             b = Float.parseFloat(et2.getText().toString());
             c = a * b;
             t.setText(String.valueOf(c));
             break;


         case R.id.b4:
             a = Float.parseFloat(et.getText().toString());
             b = Float.parseFloat(et2.getText().toString());
             c = a / b;
             t.setText(String.valueOf(c));
             break;

             default:
                 Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_SHORT).show();
                 break;

     }
    }
}
