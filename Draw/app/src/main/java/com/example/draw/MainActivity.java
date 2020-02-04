package com.example.draw;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

  ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=(ImageView)findViewById(R.id.img_draw);

        Bitmap bg = Bitmap.createBitmap(1000,2000,Bitmap.Config.ARGB_8888);
        img.setBackgroundDrawable(new BitmapDrawable(bg));

        Canvas can =new Canvas(bg);

        Paint p=new Paint();
        p.setColor(Color.BLUE);
        p.setTextSize(65);

        can.drawText("Rectangle",420,150,p);
        can.drawRect(500,200,850,700,p);

        can.drawText("Circle",120,150,p);
        can.drawCircle(200,350,150,p);

        can.drawText("Square",120,800,p);
        can.drawRect(50,850,350,1150,p);

        can.drawText("Line",480,800,p);
        can.drawLine(520,350,520,1250,p);

        can.drawText("cir",120,1200,p);
        can.drawRoundRect(150,1250,350,1600,200,200,p);





    }
}
