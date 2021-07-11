/*
Create a class Game, which allows user to play "Guess The Number" game once.
1. Constructor to generate random number.
2. takeUserInout() to take input number.
3. isCorrectNumber() to detect whether number entered is correct.
4. getter & setter for no of guesses.
Maximum no of guesses are 10
 */

package com.company;

import java.util.Random;
import java.util.Scanner;

class Game {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    private int guesses, randNo, input;
    private boolean win;

    public Game() {
        randNo = rand.nextInt(100);
        randNo++;
        guesses = 0;
        win = false;
    }

    public void takeUserInput() {
        System.out.print("Guess a number from 1 to 100 : ");
        input = sc.nextInt();
        guesses++;
    }

    public void isCorrectNo() {
        if (randNo == input) {
            win = true;
            System.out.println("Yay!! Correct number guessed.");
        } else if ((randNo - input) <= 10 && (randNo > input)) {
            System.out.println("Guess a little big");
        } else if ((randNo - input) > 10 && (randNo > input)) {
            System.out.println("Guess a big");
        } else if ((input - randNo) <= 10) {
            System.out.println("Guess a little small");
        } else {
            System.out.println("Guess a small");
        }
        System.out.println("Only " + (10 - guesses) + " guesses left.");
    }

    public int getGuesses() {
        return guesses;
    }

    public boolean isWon() {
        return win;
    }

    public void checkResult() {
        if (win) {
            System.out.println("Yay!! you guessed in " + guesses + " guesses.");
        } else {
            System.out.println("Alas!! you lost the game.");
        }
        System.out.println("The correct no was " + randNo);
    }
}

public class E4_guess_number {
    public static void main(String[] args) {
        Game player = new Game();
        System.out.println("Lets start the game!!!");

        while (player.getGuesses() < 10 && !player.isWon()) {
            player.takeUserInput();
            player.isCorrectNo();
        }

        player.checkResult();
    }
}
