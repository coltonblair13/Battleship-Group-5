/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

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
    
    public void displayName() {
        System.out.println("The default player is " + this.name1);
    }
}
