package com.example.myprofilsayadi;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView twitter, aboutme, location, website;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        twitter     = findViewById(R.id.vector);
        aboutme     = findViewById(R.id.vector_ek1);
        location    = findViewById(R.id.vector_ek6);
        website     = findViewById(R.id.vector_ek3);


        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Twitter.class);
                startActivity(intent);
//                Toast.makeText(MainActivity.this, "Halo", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(PackageContex, Twitter.class);
            }
        });

        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,website.class);
                startActivity(intent);
//                Toast.makeText(MainActivity.this, "Halo", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(PackageContex, Twitter.class);
            }
        });

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LocationActivity.class);
                startActivity(intent);
//                Toast.makeText(MainActivity.this, "Halo", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(PackageContex, Twitter.class);
            }
        });
    }
}