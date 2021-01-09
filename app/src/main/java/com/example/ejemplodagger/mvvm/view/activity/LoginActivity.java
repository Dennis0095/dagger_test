package com.example.ejemplodagger.mvvm.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.ejemplodagger.App;
import com.example.ejemplodagger.R;
import com.example.ejemplodagger.models.Body;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {
    @Inject
    Body body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((App) getApplication()).getComponent().injectLogin(this);

        Log.d("DMA_LECTOR:",  body.head.getName());
    }
}