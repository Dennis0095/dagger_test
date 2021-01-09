package com.example.ejemplodagger.mvvm.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejemplodagger.App;
import com.example.ejemplodagger.R;
import com.example.ejemplodagger.models.Body;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Body body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App ap = (App) getApplication();
        ap.getComponent().injectMain(this);
        String t;
        findViewById(R.id.tvInicio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }
}