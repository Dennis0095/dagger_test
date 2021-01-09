package com.example.ejemplodagger.module;

import com.example.ejemplodagger.models.Arm;
import com.example.ejemplodagger.models.Body;
import com.example.ejemplodagger.models.Head;
import com.example.ejemplodagger.models.Leg;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class CuerpoModule {
    // funciones que van a proveer esas dependencias
    private Head head;
    private Leg legL, legR;
    private Arm armL, armR;

    /*public CuerpoModule(Head head, Leg legL, Leg legR, Arm armL, Arm armR) {
        this.head = head;
        this.legL = legL;
        this.legR = legR;
        this.armL = armL;
        this.armR = armR;
    }*/
 
    @Provides
    @Singleton // solo se crea una vez
    public Head provideHead(){
        //return new Head("cabeza");
        return this.head;
    }

    @Provides
    @Singleton // solo se crea una vez
    @Named("armR")
    public Arm provideArmR(){
        //return new Arm("Brazo derecho");
        return this.provideArmR();
    }

    @Provides
    @Singleton
    @Named("armL")
    public Arm provideArmL(){
        //return new Arm("Brazo Izquierdo");
        return this.provideArmL();
    }

    @Provides
    @Singleton
    @Named("legR")
    public Leg provideLegR(){
        //return new Leg("pierna derecho");
        return this.provideLegR();
    }

    @Provides
    @Singleton
    @Named("lefL")
    public Leg provideLegL(){
        //return new Leg("Pierna Izquierdo");
        return this.provideLegL();
    }

    /*@Provides
    @Singleton
    public Body provideBody(Head head, @Named("armR") Arm armR,
                            @Named("armL") Arm armL, @Named("legR") Leg legR,
                            @Named("lefL") Leg legL){
        return new Body(head, armR, armL, legR, legL);
    }*/
}
