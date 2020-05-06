package com.company;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Your final score was " + calculateScore(true, 800, 5, 100));
//        System.out.println("Your final score was " + calculateScore(true, 10000, 8, 200));


        int userTablePosition = calculateHighScore(1500);
        displayHighScorePosition("Abby", userTablePosition);

        userTablePosition = calculateHighScore(900);
        displayHighScorePosition("Julio", userTablePosition);

        userTablePosition = calculateHighScore(400);
        displayHighScorePosition("ET", userTablePosition);

        userTablePosition = calculateHighScore(50);
        displayHighScorePosition("Vic", userTablePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
      if (gameOver){
          int finalScore = score + (levelCompleted * bonus);
          finalScore += 2000;
          return  finalScore;
      }
      return - 1;
    }

    public static void displayHighScorePosition(String name, int playerPosition){
        System.out.println(name + " managed to get into position " + playerPosition + ". Can you beat it? ");

    };

    public static int calculateHighScore(int playerScore){
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500){
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
            return 4;
    }
}
