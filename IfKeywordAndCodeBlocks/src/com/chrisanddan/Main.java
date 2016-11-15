package com.chrisanddan;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 200;

        int scoreTwo = 10000;
        int levelCompletedTwo = 8;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        if (gameOver){
            int finalScoreTwo = scoreTwo + (levelCompletedTwo * bonus);
            System.out.println("Your final score was " + finalScoreTwo);
        }

    }
}
