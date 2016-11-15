package com.chrisanddan;

public class Main {

    public static void main(String[] args) {


        for (int i=0; i<5; i++){
            System.out.println("Loop " + i + " hello!");
        }

//        String.format will allow you to restrict the result to required number of decimal places,
//         google how to use it that way

        for (int i=8; i>1; i--){
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0,i));
        }

        int count = 0;

        for (int i = 1; i < 1000; i++){

            if (isPrime(i)){
                System.out.println("Your prime number is " + i + ".");
                count++;
            }
            if (count == 3){
                break;
            }

        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }

    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for (int i =2; i <= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
