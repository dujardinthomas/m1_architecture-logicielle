package org.example.structural.bridge;

public abstract class Shape {

    protected DrawApi drawApi;

    public Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    protected abstract void draw();
}