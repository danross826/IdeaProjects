package com.chrisanddan;

public class Main {

    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 100;
        int evenCount = 0;
        while (number <= finishNumber){
            if (!isEvenNumber(number)){
                number++;
                continue;
            }else if (isEvenNumber(number)){
                System.out.println("The even number is " + number);
                number++;
                evenCount++;
                if (evenCount == 5){
                    System.out.println(evenCount + " even numbers has been found.");
                    break;
                }

            }
        }
    }

    public static boolean isEvenNumber (int number){
        if ((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }
}
