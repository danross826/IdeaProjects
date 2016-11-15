package com.chrisanddan;

public class Main {

    public static void main(String[] args) {

        byte myByte = 10;
        short myShort = 20;
        int myInt = 100000;
        long myLong = 50000L + 10L * (long) (myByte + myShort + myInt);

        System.out.println("longTotal = " + myLong);



    }
}
