package com.example.rake.tourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class next extends AppCompatActivity {

    ImageView imageview;
    int position=MainActivity.pos;
    Integer img[]={R.drawable.akshar,R.drawable.chandni,R.drawable.india,R.drawable.jama,R.drawable.lotus,R.drawable.qutub};
TextView heading;
    TextView mater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        imageview= (ImageView) findViewById(R.id.imageView);
heading= (TextView) findViewById(R.id.textView);
       mater= (TextView) findViewById(R.id.infor);
        mater.setText(MainActivity.infor[position]);
        heading.setText(MainActivity.city[position]);
        imageview.setImageResource(img[position]);


    }

}
