package com.example.laxmi.openapp;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void Open(View view)
    {
        int n=15;
        Intent openapp=getPackageManager().getLaunchIntentForPackage("com.android.chrome");
      

        startActivity(openapp);

    }

}
