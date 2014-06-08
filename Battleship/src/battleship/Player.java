/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

import java.util.Scanner;

/**
 *
 * @author Chelsea Miller
 */

public class Player {
    String name1 = "Player1";
    String name2 = "Player2";
    int player1Hits;
    int player2Hits;
    int player1Misses;
    int player2Misses;
    int player1Wins;
    int player1Losses;
    int player2Wins;
    int player2Losses;
    int player1TotalGames;
    int player2TotalGames;
    int hitsLeft = 17;
    
    public String[] getName() {
        String[] name = new String[10];
        for (int x = 0; x < name.length; x++) {
            name[x] = "\0";
        }
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (!"Q".equals(input.next())) {
            if (i < 10) {
                System.out.println("Please enter a player's name, or \"Q\" to exit: ");
                name[i] = input.next();
                i++;
            }
            else {
                break;
            }
        }
        return name;
    }
    
    public void displayName() {
        System.out.println("The default player is " + this.name1);
    }
    
    String[] usedGuesses = this.createUsedGuesses();
    
    public String[] createUsedGuesses() {
        String[] usedGuesses = new String[25];
        for(int i = 0; i < usedGuesses.length; i++)
            usedGuesses[i] = "\0";
        return usedGuesses;
    }
    
    public String setLoser() {
        //This will contain code to set who the loser is.
        String loser = "Person";
        return loser;
    }
    
    public String setWinner() {
        //This will contain code to set who the winner is.
        String winner = "Other Person";
        return winner;
    }
}
