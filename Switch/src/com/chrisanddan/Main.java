package com.chrisanddan;

public class Main {

    public static void main(String[] args) {


        int value = 1;
        if (value == 1){
            System.out.println("Value was 1.");
        }else if (value == 2){
            System.out.println("Value was 2.");
        }else{
            System.out.println("Was not 1 or 2.");
        }

        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1.");
                break;

            case 2:
                System.out.println("Value was 2.");
                break;
            case 3:case 4:case 5:
                System.out.println("was a 3, or a 4, or a 5. ");
                System.out.println("Actually, it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }
        char switchValueTwo = 'f';

        switch (switchValueTwo){
            case 'a':
                System.out.println("Switch value was a.");
                break;

            case 'b':
                System.out.println("Switch value was b.");
                break;

            case 'c':
                System.out.println("Switch value was c.");
                break;

            case 'd':
                System.out.println("Switch value was d.");
                break;

            default:
                System.out.println("Was none of the listed letters");
                break;
        }
    }
}