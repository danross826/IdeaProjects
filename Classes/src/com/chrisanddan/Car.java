package com.chrisanddan;

/**
 * Created by danross on 11/13/16.
 */
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel (String model){
        this.model = model;
    }

    public void setEngine (String engine){
        this.engine = engine;
    }

    public void setColor (String color){
        this.color = color;
    }

    public String getModel (){
        return this.model;
    }
}
