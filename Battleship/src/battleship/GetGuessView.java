package battleship;

import cit26001.group5.battleship.menucontrol.MainMenuControl;
import cit26001.group5.battleship.menuviews.GameChoicesView;
import java.awt.Point;
import java.util.Scanner;
import cit26001.group5.battleship.interfaces.*;

/**
 *
 * @author Ethan Stewart
 */
public class GetGuessView implements GetLocation {

    public int getGuess(Player player) {
        int playerNumber;
        switch (player.playerNum) {
            case 1:
                playerNumber = this.getPlayerGuess(player);
                break;
            case 2:
                playerNumber = this.getPlayerGuess(player);
                break;
            default:
                playerNumber = 1;
                System.out.println("Invalid number inside currentPlayerNumber variable"
                    + "in the Player class.");
        }
        return playerNumber;
    }
    
    public int getPlayerGuess(Player player) {
        Scanner input = new Scanner(System.in);     
        Location locationObject = new Location();
        GameChoicesView gameChoicesViewObject = new GameChoicesView();
        MainMenuControl mnMenuCtrlObj = new MainMenuControl();
        int playerNumber = player.playerNum;

        boolean valid = false;

        while (!valid) {
            //Prompt for location on board to be "shot" at.
            System.out.println("\n\n\t" + player.name + ", it is your turn to guess."
                    + " Enter a row letter and column number (For example: D3)");

            //Get the value entered by the user 
            String strRowColumn = this.getLocation();

            //Trim off all extra blanks from the input
            strRowColumn = strRowColumn.trim();
            
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
            if (!checkValidLocal) {
                new BattleshipError().displayError(
                        "Please enter a valid location, "
                        + "or a \"Q\" to quit. Try again.");
            }

            //See if the location is occupied by the opponent's ship.
            
            boolean boolHitMiss = false;
            if ("S".equals(player.personalBoard[iLocation][jLocation])) {
                boolHitMiss = true;
            }

            //If true, display hit message
            if (boolHitMiss) {
                System.out.println("Hit!");
                player.personalBoard[iLocation][jLocation] = "X";
                player.hitMissBoard[iLocation][jLocation] = "X";
            } //If false, display miss message
            else {
                System.out.println("Miss!");
                player.hitMissBoard[iLocation][jLocation] = "O";
                if (playerNumber == 1)
                    playerNumber = 2;
                else
                    playerNumber = 1;
            }
            System.out.println("Your hit/miss board has been updated.");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j ++)
                    System.out.print(player.hitMissBoard[i][j] + "\t");
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
    
    /**
     *
     * @return
     */
    @Override
    public String getLocation() {
        Scanner locationIn = new Scanner(System.in);
        String location = locationIn.nextLine();
        return location;
    }
}
