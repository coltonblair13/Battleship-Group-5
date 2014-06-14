package battleship;

import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Ethan Stewart
 */
public class GetGuessView {

    public int getGuess(String[][] playerOnePersonalBoard, String[][] playerOneHitMissBoard, 
                         String[][] playerTwoPersonalBoard, String[][] playerTwoHitMissBoard, 
                         int currentPlayer) {
        int playerNumber;
        switch (currentPlayer) {
            case 1:
                playerNumber = this.getPlayerOneGuess(playerOneHitMissBoard, playerTwoPersonalBoard);
                break;
            case 2:
                playerNumber = this.getPlayerTwoGuess(playerTwoHitMissBoard, playerOnePersonalBoard);
                break;
            default:
                playerNumber = 1;
                System.out.println("Invalid number inside currentPlayerNumber variable"
                    + "in the Player class.");
        }
        return playerNumber;
    }
    
    public int getPlayerOneGuess(String[][] playerOneHitMissBoard, 
                         String[][] playerTwoPersonalBoard) {
        Scanner input = new Scanner(System.in);     
        Location locationObject = new Location();
        Player playerObject = new Player();
        GameChoicesView gameChoicesViewObject = new GameChoicesView();
        MainMenuControl mnMenuCtrlObj = new MainMenuControl();
        int playerNumber = 2;
        
        String playerName;
        if (gameChoicesViewObject.playerNumber == 1)
            playerName = mnMenuCtrlObj.player1;
        else
            playerName = mnMenuCtrlObj.player2;

        boolean valid = false;

        while (!valid) {
            //Prompt for location on board to be "shot" at.
            System.out.println("\n\n\t" + playerName + ", it is your turn to guess."
                    + " Enter a row letter and column number (For example: D3)");

            //Get the value entered by the user 
            String strRowColumn = input.nextLine();

            //Trim off all extra blanks from the input
            strRowColumn = strRowColumn.trim();
            
            /*Add error message if guess doesn't contain enough characters?*/
            
            int iLocation = 0;
            int jLocation = 0;

            String[][] listOfSpots = locationObject.makeStringListOfSpots();

            boolean checkValidLocal = false;
            for (iLocation = 0; iLocation < 5; iLocation++) {
                for (jLocation = 0; jLocation < 5; jLocation++) {
                    if (strRowColumn.equals(listOfSpots[iLocation][jLocation])) {
                        checkValidLocal = true;
                        break;
                    }
                }
                if (checkValidLocal)
                    break;

            }
            if (checkValidLocal == false) {
                new BattleshipError().displayError(
                        "Please enter a valid location, "
                        + "or a \"Q\" to quit. Try again.");
            }

            //See if the location is occupied by the opponent's ship.
            
            boolean boolHitMiss = false;
            if ("S".equals(playerTwoPersonalBoard[iLocation][jLocation])) {
                boolHitMiss = true;
            }

            //If true, display hit message
            if (boolHitMiss) {
                System.out.println("Hit!");
                playerTwoPersonalBoard[iLocation][jLocation] = "X";
                playerOneHitMissBoard[iLocation][jLocation] = "X";
            } //If false, display miss message
            else {
                System.out.println("Miss!");
                playerOneHitMissBoard[iLocation][jLocation] = "O";
            }
            System.out.println("Your hit/miss board has been updated.");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j ++)
                    System.out.print(playerOneHitMissBoard[i][j] + "\t");
                System.out.print("\n\n");
            }
            
            valid = true; // a valid location was entered

        }
        return playerNumber;

    }
    
    public int getPlayerTwoGuess(String[][] playerTwoHitMissBoard, 
                         String[][] playerOnePersonalBoard)  {
        Scanner input = new Scanner(System.in);     
        Location locationObject = new Location();
        Player playerObject = new Player();
        GameChoicesView gameChoicesViewObject = new GameChoicesView();
        MainMenuControl mnMenuCtrlObj = new MainMenuControl();
        int playerNumber = 1;
        
        String playerName;
        if (gameChoicesViewObject.playerNumber == 1)
            playerName = mnMenuCtrlObj.player1;
        else
            playerName = mnMenuCtrlObj.player2;

        boolean valid = false;

        while (!valid) {
            //Prompt for location on board to be "shot" at.
            System.out.println("\n\n\t" + playerName + ", it is your turn to guess."
                    + " Enter a row letter and column number (For example: D3)");

            //Get the value entered by the user 
            String strRowColumn = input.nextLine();

            //Trim off all extra blanks from the input
            strRowColumn = strRowColumn.trim();
            
            /*Add error message if guess doesn't contain enough characters?*/
            
            int iLocation = 0;
            int jLocation = 0;

            String[][] listOfSpots = locationObject.makeStringListOfSpots();

            boolean checkValidLocal = false;
            for (iLocation = 0; iLocation < 5; iLocation++) {
                for (jLocation = 0; jLocation < 5; jLocation++) {
                    if (strRowColumn.equals(listOfSpots[iLocation][jLocation])) {
                        checkValidLocal = true;
                        break;
                    }
                }
                if (checkValidLocal)
                    break;

            }
            if (checkValidLocal == false) {
                new BattleshipError().displayError(
                        "Please enter a valid location, "
                        + "or a \"Q\" to quit. Try again.");
            }

            //See if the location is occupied by the opponent's ship.
            
            boolean boolHitMiss = false;
            if ("S".equals(playerOnePersonalBoard[iLocation][jLocation])) {
                boolHitMiss = true;
            }

            //If true, display hit message
            if (boolHitMiss) {
                System.out.println("Hit!");
                playerOnePersonalBoard[iLocation][jLocation] = "X";
                playerTwoHitMissBoard[iLocation][jLocation] = "X";
            } //If false, display miss message
            else {
                System.out.println("Miss!");
                playerTwoHitMissBoard[iLocation][jLocation] = "O";
            }
            System.out.println("Your hit/miss board has been updated.");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j ++)
                    System.out.print(playerTwoHitMissBoard[i][j] + "\t");
                System.out.print("\n\n");
            }
            
            valid = true; // a valid location was entered

        }
        return playerNumber;
    }

    public boolean checkUsedGuesses(String guess, String[] usedGuesses) {
        boolean found = false;
        for (String x : usedGuesses) {
            if (x.equals(guess)) {
                found = true;
            }

            if (found == true) {
                break;
            }
        }
        return found;
    }
}
