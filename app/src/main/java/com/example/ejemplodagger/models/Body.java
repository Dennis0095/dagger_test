package com.example.ejemplodagger.models;

public class Body {
    public Head head;
    public Arm armL, armR;
    public Leg legL, legR;

    public Body(Head head, Arm armL, Arm armR, Leg legL, Leg legR){
        this.head = head;
        this.armL = armL;
        this.armR = armR;
        this.legL = legL;
        this.legR = legR;
    }
}
