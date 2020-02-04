package com.example.reverse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.Buffer;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button b1;
    TextView v1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        b1=findViewById(R.id.bt1);
        v1=findViewById(R.id.v1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer b = new StringBuffer(et1.getText().toString());
                v1.setText(b.reverse());
            }
        });
    }
}
