package com.chrisanddan;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        Primitive Types:
//        Byte
//        short
//        int
//        long
//        float
//        double
//        char
//        boolean

//        This is a lesson on strings and string concatenation

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more.";

        System.out.println(myString);

        String numberString = "45.9";
        String mumberString = numberString + "55.9";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);
    }
}
