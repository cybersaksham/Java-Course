/*
1 --> Rock
2 --> Paper
3 --> Scissors

Play game against computer of 5 rounds.
Display score at end of each round.
Finally display winner.
 */

package com.company;

import java.util.Random;
import java.util.Scanner;

public class E2_rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int comp, player, comp_score = 0, player_score = 0, i = 1;
        String comp_char, player_char;
        System.out.println("Lets, start game!!");

        // Game Loop
        while (i <= 5) {
            // Initializing round
            System.out.println("\nRound " + i + " :");
            System.out.print("Enter 1 for rock, 2 for paper & 3 for scissors : ");
            player = sc.nextInt();
            comp = rand.nextInt(3);

            // Checking for winner of this round
            if (player == 1) {
                player_char = "Rock";
                comp_char = "Rock";
                if (comp == 1) { // Rock Paper
                    comp_score += 1;
                    comp_char = "Paper";
                } else if (comp == 2) { // Rock Scissors
                    player_score += 1;
                    comp_char = "Scissors";
                }
            } else if (player == 2) {
                player_char = "Paper";
                comp_char = "Paper";
                if (comp == 0) { // Paper Rock
                    player_score += 1;
                    comp_char = "Rock";
                } else if (comp == 2) { // Paper Scissors
                    comp_score += 1;
                    comp_char = "Scissors";
                }
            } else if (player == 3) {
                player_char = "Scissors";
                comp_char = "Scissors";
                if (comp == 0) { // Scissors Rock
                    comp_score += 1;
                    comp_char = "Rock";
                } else if (comp == 1) { // Scissors Paper
                    player_score += 1;
                    comp_char = "Paper";
                }
            } else {
                System.out.println("Enter correct choice!!!");
                continue;
            }

            // Printing status
            System.out.println("\tRound " + i + " --> " + player_char + " " + comp_char);
            System.out.println("\tScore   -->   " + player_score + "    " + comp_score);

            // Increasing round no
            i += 1;
        }

        // Checking for final winner
        if (comp_score > player_score) {
            System.out.println("\nComputer won by " + (comp_score - player_score) + " points!!!");
        } else if (comp_score < player_score) {
            System.out.println("\nYou won by " + (player_score - comp_score) + " points!!!");
        } else {
            System.out.println("\nGame Tied!!!");
        }
    }
}
