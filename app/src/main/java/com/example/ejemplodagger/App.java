package com.example.ejemplodagger;

import android.app.Application;

import com.example.ejemplodagger.component.CuerpoComponent;
import com.example.ejemplodagger.component.DaggerCuerpoComponent;
import com.example.ejemplodagger.models.Arm;
import com.example.ejemplodagger.models.Head;
import com.example.ejemplodagger.models.Leg;
import com.example.ejemplodagger.module.CuerpoModule;

public class App  extends Application {
    private CuerpoComponent cuerpoComponent;

    @Override
    public void onCreate() {
        super.onCreate();
       /*cuerpoComponent = DaggerCuerpoComponent.builder()
               .cuerpoModule(new CuerpoModule(new Head("cabeza  ewrwerwe"), new Leg("brazo izquierdo"), new Leg("brazo derecho"),
                       new Arm("pierna izquierda"), new Arm("pierna derecha"))).build();*/
        cuerpoComponent = DaggerCuerpoComponent.builder().cuerpoModule(new CuerpoModule()).build();
    }

    public CuerpoComponent getComponent() {
        return this.cuerpoComponent;
    }


}
