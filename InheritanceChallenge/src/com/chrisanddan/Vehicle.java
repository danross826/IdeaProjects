package com.chrisanddan;

/**
 * Created by danross on 11/17/16.
 */
public class Vehicle {

    private String name;
    private String size;
    private int currentDirection;
    private int currentVelocity;

    public void move(int direction, int velocity){
        currentVelocity = velocity;
        currentDirection = direction;

        System.out.println("This vehicle is moving at " + currentVelocity + " in the direction of " + currentDirection);
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): steering at " + currentDirection + " degrees.");
    }

    public Vehicle(String name, String size) {
        this.currentDirection = 0;
        this.currentVelocity = 0;
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
}
