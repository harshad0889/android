package com.example.primstrong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button b1;
    Button b2;
    Button b3;
    TextView v1;
    int a,m=0,b,i,flag=0,am,temp,sum,num1,num2,temp2,sum2,pn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        b1=findViewById(R.id.bt1);
        b2=findViewById(R.id.bt2);
        b3=findViewById(R.id.bt3);
        v1=findViewById(R.id.v1);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Integer.parseInt(et1.getText().toString().trim());
                a=b;
                m=a/2;

                if(a==0||a==1) {
                    Toast.makeText(MainActivity.this, "not a prime", Toast.LENGTH_LONG).show();
                }
                    else
                    {
                         for(i=2;i<=m;i++)
                         {
                             if(a%i==0){
                                 Toast.makeText(MainActivity.this,"not prime",Toast.LENGTH_LONG).show();
                                 flag=1;
                                 break;}
                         }

                    if(flag==0)
                    {
                        Toast.makeText(MainActivity.this," prime",Toast.LENGTH_LONG).show();

                    }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=Integer.parseInt(et1.getText().toString());
                am=num1;
                while(am>0)
                {
                  temp=am%10;
                  sum=sum+temp*temp*temp;
                  am=am/10;

                }
                if(sum==num1) {
                    Toast.makeText(MainActivity.this, "amstrong", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"not amstrong",Toast.LENGTH_LONG).show();

                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num2=Integer.parseInt(et1.getText().toString());
                pn=num2;
                while(num2>0)
                {
                    temp2=num2%10;
                    sum2=(sum2*10)+temp2;
                    num2=num2/10;
                }
                if(pn==sum2)
                {
                    Toast.makeText(MainActivity.this,"palindrome",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"not pal",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
