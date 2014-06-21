/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Chelsea Miller
 */
public class Player implements Serializable {

    /* With the cohesion/coupling thing, we only need one of each statistic, since 
     each player will have their own object with these attributes. */
    public String name;
    public int playerNum;
    private int playerHits;
    private int playerMisses;
    private int playerWins;
    private int playerLosses;
    private int playerTotalGames;
    private int hitsLeftToWin;
    public String[][] personalBoard;
    public String[][] hitMissBoard;

    /* This is the default constructor, which sets the default value for the class instance variables. */
    Player() {
        name = "Player1";
        playerNum = 1;
        playerHits = 0;
        playerMisses = 0;
        playerWins = 0;
        playerLosses = 0;
        playerTotalGames = 0;
        hitsLeftToWin = 5;
        hitMissBoard = Board.createBoard();
    }
    
    public void endOfGameStats(Player player) {
        int playerShots = this.playerHits + this.playerMisses;
        double playerWinPercent = (double) this.playerWins / (double) 
                this.playerTotalGames * 100;
        playerWinPercent = Math.round(playerWinPercent * 10) / 10;
        double playerLosePercent = 100 - playerWinPercent;
        System.out.println("GAME OVER!");
        System.out.println("\nStats for " + this.name
                    + "\nHits:\t\t" + this.playerHits
                    + "\nMisses:\t\t" + this.playerMisses
                    + "\nTotal Shots:\t" + playerShots
                    + "\n% Games Won:\t" + playerWinPercent
                    + "\n% Games Lost:\t" + playerLosePercent);        
    }

    private Player changePlayerName(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name for Player " + player.playerNum);
        player.name = input.next();
        return player;
    }
    
    /*  Nested class inside the Player class for the locations of players's ships. */
    private class PlayerLocations {

        private String[][] setPlayerShips(String playerName) {
            Scanner input = new Scanner(System.in);
            int iLocation = 0;
            int jLocation = 0;

            Location locationObject = new Location();
            String[][] listOfSpots = locationObject.makeStringListOfSpots();

            String[][] playerPersonalBoard = Board.createBoard();

            System.out.println(playerName + ", enter 5 locations where your ships should be placed.");
            for (int location = 0; location < 5; location++) {
                System.out.println("Please enter a location");
                //Get the value entered by the user 
                String strRowColumn = input.nextLine();
                //Trim off all extra blanks from the input
                strRowColumn = strRowColumn.trim();
                //Replace any commas enter with blanks
                strRowColumn = strRowColumn.replace(',', ' ');

                boolean checkValid = false;
                boolean spotUsed = false;

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (strRowColumn.equals(listOfSpots[i][j])) {
                            checkValid = true;
                            iLocation = i;
                            jLocation = j;
                            break;
                        }
                    }
                }

                if ("S".equals(playerPersonalBoard[iLocation][jLocation])) {
                    spotUsed = true;
                }

                if (!checkValid) {
                    System.out.println("Invalid location. Please use a valid row letter "
                            + "(A to E) and a valid row number (1 to 5)");
                    location--;
                } else if (spotUsed) {
                    System.out.println("You already have part of a ship on this location."
                            + "Please use a different location.");
                    location--;
                } else {
                    playerPersonalBoard[iLocation][jLocation] = "S";
                }

            }
            return playerPersonalBoard;

        }

        private String setLoser() {
            //This will contain code to set who the loser is.
            String loser = "Person";
            return loser;
        }

        private String setWinner() {
            //This will contain code to set who the winner is.
            String winner = "Other Person";
            return winner;
        }
    }
}