package com.chrisanddan;

public class Main {

    public static void main(String[] args) {
//        Addition operator exercises

	    int result = 1 + 2;

        int previousResult = 0;

        System.out.println("1 + 2 = " + result);

        result = result - 1;

        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result *10;
        System.out.println(previousResult +" * 10 = " + result);

        previousResult = result;

        result = result/5;
        System.out.println(previousResult +" / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        boolean isAlien = false;

        if (isAlien == false)
            System.out.println("Not an alien!");

        int topScore = 100;
        if (topScore > 100)
            System.out.println("You got the high score!");

//        remember to put parentheses around each condition in a conditional statement

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore == 100))
            System.out.println("Greater than second top score and less than 100");

        int thirdTopScore = 80;
        if(thirdTopScore == 87 || secondTopScore > 80)
            System.out.println("this isn't supposed to happen");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("it was a car");

        isCar = true;

//        This is ternary, it will do the thing on the left if it's equal to the first condition

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("it really was a car");

        double myVariable = 20;
        double myVariableTwo = 80;

        myVariable = myVariable + myVariableTwo;

        myVariable = myVariable * 25;

        double remainder = myVariable % 40;

        System.out.println(remainder);

        if (remainder <= 20)
            System.out.println("Total was over limit.");




    }
}
