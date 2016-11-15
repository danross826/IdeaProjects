package com.chrisanddan;

public class Main {

    public static void main(String[] args) {
//	    boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        calculateScore(true, 800, levelCompleted, bonus);
//
//        int highScore = calculateScore(false, 10000, 8, 200);
//
//        System.out.println("Your final score was " + highScore);

    int playerScore = calculateScore( true, 5000, 5, 8);



        int position =  calculateHighScorePosition(5000);

        displayHighScorePosition("Chris",position);

        System.out.println(playerScore);
        System.out.println(position);



    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }else{
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println("Player " + name + " got into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 1000){
            return 1;
        }else if(playerScore > 500 && playerScore < 1000){
            return 2;
        }else if(playerScore > 100 && playerScore < 500){
            return 3;
        }else {
            return 4;
        }
    }
}
