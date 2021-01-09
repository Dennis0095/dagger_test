package com.example.ejemplodagger.component;

import com.example.ejemplodagger.module.CuerpoModule;
import javax.inject.Singleton;

import com.example.ejemplodagger.mvvm.view.activity.LoginActivity;
import com.example.ejemplodagger.mvvm.view.activity.MainActivity;

import dagger.Component;

@Singleton
@Component(modules = CuerpoModule.class)
public interface CuerpoComponent {
    void injectMain(MainActivity main);
    void injectLogin(LoginActivity login);
}
