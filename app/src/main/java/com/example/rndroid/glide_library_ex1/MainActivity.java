package com.example.rndroid.glide_library_ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageview);
        Glide.with(this).// with()--> context
                load("https://en.wikipedia.org/wiki/File:Aeroflot_Airbus_A330_Kustov.jpg").// pass URL
                placeholder(R.mipmap.ic_launcher). // show dummy image while image is downloading
                crossFade()// it will replace with orignal image once downloded
                .into(imageView);// put onto view
    }
}
