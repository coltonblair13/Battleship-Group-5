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

    int currentPlayerNumber = 1;
//this sets the nested class inside the player class, by chelsea

private class location{ 
public String[][] setPlayerOneShips(String playerName) {
        Scanner input = new Scanner(System.in);
        int iLocation = 0;
        int jLocation = 0;
        } 
    
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
            } else {
                break;
            }
        }
        return name;
    }

    /**
     *
     * @return
     */
    
    private String changePlayerOneName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name for Player 1");
        String name = input.next();
        this.name1 = name;
        return name;
    }
    
    private String changePlayerTwoName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name for Player 2");
        String name = input.next();
        this.name2 = name;
        return name;
    }

    public String[][] setPlayerOneShips(String playerName) {
        Scanner input = new Scanner(System.in);
        int iLocation = 0;
        int jLocation = 0;
        
        Location locationObject = new Location();
        String[][] listOfSpots = locationObject.makeStringListOfSpots();
        
        Board boardObject = new Board();
        String[][] playerOnePersonalBoard = boardObject.playerOnePersonalBoard;
        
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
            
            if ("S".equals(playerOnePersonalBoard[iLocation][jLocation]))
                spotUsed = true;
            
            if (!checkValid) {
                System.out.println("Invalid location. Please use a valid row letter "
                        + "(A to E) and a valid row number (1 to 5)");
                location--;
            }
            else if (spotUsed == true) {
                System.out.println("You already have part of a ship on this location."
                        + "Please use a different location.");
                location--;
            }
            else
                playerOnePersonalBoard[iLocation][jLocation] = "S";

        }
        return playerOnePersonalBoard;

    }

    public String[][] setPlayerTwoShips(String playerName) {
        Scanner input = new Scanner(System.in);
        int iLocation = 0;
        int jLocation = 0;
        
        Location locationObject = new Location();
        String[][] listOfSpots = locationObject.makeStringListOfSpots();
        
        Board boardObject = new Board();
        String[][] playerTwoPersonalBoard = boardObject.playerTwoPersonalBoard;
        
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
            
            if ("S".equals(playerTwoPersonalBoard[iLocation][jLocation]))
                spotUsed = true;
            
            if (!checkValid) {
                System.out.println("Invalid location. Please use a valid row letter "
                        + "(A to E) and a valid row number (1 to 5)");
                location--;
            }
            else if (spotUsed == true) {
                System.out.println("You already have part of a ship on this location."
                        + "Please use a different location.");
                location--;
            }
            else
                playerTwoPersonalBoard[iLocation][jLocation] = "S";

        }
        return playerTwoPersonalBoard;

    }

    public void displayName() {
        System.out.println("The default player is " + this.name1);
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
